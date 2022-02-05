package jp.wintercat.veterinaryclinic.mapping;


import jp.wintercat.veterinaryclinic.entity.Animal;
import jp.wintercat.veterinaryclinic.entity.ClinicalRecords;
import jp.wintercat.veterinaryclinic.entity.Invoice;
import jp.wintercat.veterinaryclinic.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;


/**
 * Route
 */
@Controller
public class ClinicServiceController {

    @Autowired
    ClinicService clinicService;

    // 主入口
    @RequestMapping("/")
    public String clinicalIndex() {
        return "VeterinaryClinic";
    }

    //　予約申請ページ
    @RequestMapping("/invoiceApply")
    public String invoiceApply(Model model) {
        List<Animal> animalList = clinicService.searchAnimalList();
        model.addAttribute("animal_list", animalList);
        return "InvoiceApply";
    }

    // 予約申請受け取り
    @RequestMapping(value = "/invoiceUpload", method = RequestMethod.POST)
    public String invoiceUpload(HttpServletRequest request, Model model) {
        if (request.getParameter("visit_name").trim() != "" && request.getParameter("visit_phone").trim() != "") {
            // name and phone check
            if(request.getParameter("visit_name").trim().length()<6&&request.getParameter("visit_phone").trim().length()<=13) {
                // name and phone check
                ClinicalRecords clinicalRecords = new ClinicalRecords();
                clinicalRecords.setDrugList(null);
                clinicalRecords.setLodging(0);
                clinicalRecords.setFirstVisit(Integer.parseInt(request.getParameter("first_visit_radio")));
                clinicalRecords.setMeal(0);
                // invoice
                Invoice invoice = new Invoice();
                invoice.setInvoiceNumber(clinicService.serialCreator(Integer.parseInt(request.getParameter("category"))));
                invoice.setInvoiceName(request.getParameter("visit_name"));
                invoice.setInvoiceState(0);
                invoice.setAnimal(clinicService.searchAnimalById(Integer.parseInt(request.getParameter("category"))));
                invoice.setPaymentDeadline(null);
                invoice.setCreateInvoiceDate(new Date());
                invoice.setUpdateInvoiceDate(null);
                invoice.setPhone(request.getParameter("visit_phone"));
                invoice.setTotal(0);
                invoice.setClinicalRecords(clinicalRecords);
                clinicService.saveInvoiceApply(invoice);
                return "/VeterinaryClinic";
            }else {
                List<Animal> animalList = clinicService.searchAnimalList();
                model.addAttribute("animal_list", animalList);
                return "InvoiceApply";
            }
        } else {
            // 予約ページへ戻る
            List<Animal> animalList = clinicService.searchAnimalList();
            model.addAttribute("animal_list", animalList);
            return "InvoiceApply";
        }
    }

    //　予約管理 - ページ
    @RequestMapping("/invoiceList/pages")
    public String invoiceListWithPage(@PageableDefault(page = 0, size = 10) Pageable pageable, Model model) {
        // state logic // 状態　0 未処理　1 処理済　99 支払い済　-1 キャンセル済
        model.addAttribute("untreated", clinicService.searchInvoiceByStateReturnCount(0));
        model.addAttribute("processed", clinicService.searchInvoiceByStateReturnCount(1));
        model.addAttribute("prepay", clinicService.searchInvoiceByStateReturnCount(99));
        model.addAttribute("canceled", clinicService.searchInvoiceByStateReturnCount(-1));
        model.addAttribute("all", clinicService.searchAllInvoice().size());
        // page logic
        Page<Invoice> invoicePage = clinicService.getPages(pageable);
        model.addAttribute("page", invoicePage);
        model.addAttribute("all_invoice", invoicePage.getContent());
        return "InvoiceList";
    }

    // management ページ　
    @RequestMapping("/invoiceManagement")
    public String invoiceManagement(HttpServletRequest request, Model model) {
        if (request.getParameter("management_id") != null) {
            Integer management_id = Integer.parseInt(request.getParameter("management_id"));
            // invoice 検索
            Invoice invoice = clinicService.getInvoiceByInvoiceId(management_id.longValue());
            // 金額計算
            Integer total = clinicService.updateBaseTotal(invoice);
            List<Animal> animalList = clinicService.searchAnimalList();
            model.addAttribute("management_id", management_id);
            model.addAttribute("invoice", invoice);
            model.addAttribute("animal_list", animalList);
            model.addAttribute("total", total);
            return "InvoiceManagement";
        } else {
            return "/invoiceList/pages";
        }
    }

    // management アップデート
    @RequestMapping("/invoiceManagementUpdate")
    public String invoiceManagementUpdate(HttpServletRequest request) {
        String invoice_serial = request.getParameter("invoice_number");
        String visit_name = request.getParameter("visit_name");
        String visit_phone = request.getParameter("visit_phone");
        Integer meal = Integer.parseInt(request.getParameter("meal"));
        Integer lodging = Integer.parseInt(request.getParameter("lodging"));
        Integer category = Integer.parseInt(request.getParameter("category"));
        Integer first_visit = Integer.parseInt(request.getParameter("first_visit"));
        if(invoice_serial != null && visit_name != null && visit_phone != null && meal != null && lodging != null && first_visit != null && clinicService.searchInvoiceBySerialNumber(invoice_serial) != null) {
            Invoice invoice = clinicService.searchInvoiceBySerialNumber(invoice_serial);
            ClinicalRecords clinicalRecords = clinicService.searchClinicalRecordByCid(invoice.getClinicalRecords().getCid());
            Animal animal = clinicService.searchAnimalById(category);
            // invoice set
            invoice.setInvoiceName(visit_name);
            invoice.setPhone(visit_phone);
            // 処理済　処理したことがあると「1」
            invoice.setInvoiceState(1);
            invoice.setUpdateInvoiceDate(new Date());
            // clinical record set
            clinicalRecords.setMeal(meal);
            clinicalRecords.setLodging(lodging);
            clinicalRecords.setFirstVisit(first_visit);
            // set into invoice
            invoice.setClinicalRecords(clinicalRecords);
            invoice.setAnimal(animal);
            // 料金計算
            invoice.setTotal(clinicService.updateBaseTotal(invoice));
            // save
            clinicService.saveInvoiceAndFlush(invoice);
        }
        return "/VeterinaryClinic";
    }










}
