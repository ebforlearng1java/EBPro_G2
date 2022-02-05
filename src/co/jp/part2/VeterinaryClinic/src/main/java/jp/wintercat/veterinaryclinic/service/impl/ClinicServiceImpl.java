package jp.wintercat.veterinaryclinic.service.impl;

import jp.wintercat.veterinaryclinic.entity.Animal;
import jp.wintercat.veterinaryclinic.entity.ClinicalRecords;
import jp.wintercat.veterinaryclinic.entity.Invoice;
import jp.wintercat.veterinaryclinic.repository.AnimalRepository;
import jp.wintercat.veterinaryclinic.repository.ClinicalRecordsRepository;
import jp.wintercat.veterinaryclinic.repository.InvoiceRepository;
import jp.wintercat.veterinaryclinic.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;


/**
 * サービス
 */
@Service
public class ClinicServiceImpl implements ClinicService {
    @Autowired
    private AnimalRepository animalRepository;
    @Autowired
    private InvoiceRepository invoiceRepository;
    @Autowired
    private ClinicalRecordsRepository clinicalRecordsRepository;


    static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    @Override
    public Invoice searchInvoiceBySerialNumber(String serialNumber) {
        return invoiceRepository.findInvoiceByInvoiceNumber(serialNumber);
    }

    @Override
    public String serialCreator(Integer category) {
        Random random = new Random();
        String randomA,randomB,randomC;
        SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
        // 当時の時間
        String reservationTime = sdf.format(new Date());
        randomA = String.valueOf(upper.toCharArray()[random.nextInt(upper.length())]);
        randomB = String.valueOf(upper.toCharArray()[random.nextInt(upper.length())]);
        randomC = String.valueOf(upper.toCharArray()[random.nextInt(upper.length())]);
        return  randomA+category+randomB+reservationTime+randomC;
    }
    // 動物類検索
    @Override
    public List<Animal> searchAnimalList() {
        return animalRepository.findAll();
    }
    // find by  id
    @Override
    public Animal searchAnimalById(Integer id) {
        return animalRepository.findAnimalByAid(id);
    }

    //
    @Override
    public ClinicalRecords searchClinicalRecordByCid(Long cid) {
        return clinicalRecordsRepository.findClinicalRecordsByCid(cid);
    }

    // セーブ　申請表
    @Override
    public Invoice saveInvoiceApply(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }
    // セーブ
    @Override
    public Invoice saveInvoiceAndFlush(Invoice invoice) {
        return invoiceRepository.saveAndFlush(invoice);
    }

    //  invoice 検索 by state
    @Override
    public Integer searchInvoiceByStateReturnCount(Integer state) {
        Integer invoices=invoiceRepository.findInvoicesByInvoiceState(state).size();
        return invoices;
    }

    // 全ての予約表を検索
    @Override
    public List<Invoice> searchAllInvoice() {
        return invoiceRepository.findAll();
    }
    //  予約表　状態　リスト　検索
    @Override
    public List<Invoice> searchInvoiceByState(Integer state) {
        return invoiceRepository.findInvoicesByInvoiceState(state);
    }

    // ページを検索
    @Override
    public Page<Invoice> getPages(Pageable pageable) {
        return invoiceRepository.findAll(pageable);
    }
    // Invoice 検索　( ID )
    @Override
    public Invoice getInvoiceByInvoiceId(Long id) {
        return invoiceRepository.findInvoiceById(id);
    }

    // 基本料金計算
    @Override
    public Integer updateBaseTotal(Invoice invoice) {
        Integer total = 0;
        //  状態　0 未処理　1 処理済　99 支払い済　-1 キャンセル済
        if(invoice.getInvoiceState()==1||invoice.getInvoiceState()==0){
            // 0 , 1 未処理、処理済
            if(invoice.getClinicalRecords().getFirstVisit()==0){
                total+=2000; // ２０００円　初診料
            }else {
                total+=500; // 500円　常連
            }
            if(invoice.getClinicalRecords().getLodging()==1){
                total+=1500; // １５００円　宿泊料金
            }
            if(invoice.getClinicalRecords().getMeal()==1){
                total+=500; // 食事料金
            }
            // 動物の単価 計算
            total+=invoice.getAnimal().getSpecialAmount();
            return total;
        }else {
            return invoice.getTotal();
        }
    }
    // 料金計算


}
