package jp.wintercat.veterinaryclinic;

import jp.wintercat.veterinaryclinic.entity.Animal;
import jp.wintercat.veterinaryclinic.entity.ClinicalRecords;
import jp.wintercat.veterinaryclinic.entity.DrugList;
import jp.wintercat.veterinaryclinic.entity.Invoice;
import jp.wintercat.veterinaryclinic.repository.AnimalRepository;
import jp.wintercat.veterinaryclinic.repository.ClinicalRecordsRepository;
import jp.wintercat.veterinaryclinic.repository.DrugRepository;
import jp.wintercat.veterinaryclinic.repository.InvoiceRepository;
import jp.wintercat.veterinaryclinic.service.ClinicService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class VeterinaryClinicApplicationTests {
    @Autowired
    private  InvoiceRepository invoiceRepository;
    @Autowired
    private DrugRepository drugRepository;
    @Autowired
    private AnimalRepository animalRepository;
    @Autowired
    private ClinicalRecordsRepository clinicalRecordsRepository;
    @Autowired
    private ClinicService clinicService;



    @Test
    public void searchClinical() {
        System.out.println(clinicalRecordsRepository.findClinicalRecordsByCid(1L));
    }

    /**
     * Add Sample Date [ test . data ]
     */
    @Test
    public void addSampleData(){
        List<Animal> animal_sample = new ArrayList<Animal>();
        animal_sample.add(new Animal(null,"ねこ",150));
        animal_sample.add(new Animal(null,"犬",300));
        animal_sample.add(new Animal(null,"ハムスター",80));
        animal_sample.add(new Animal(null,"鳥",120));
        animalRepository.saveAll(animal_sample);
        List<DrugList> sample_01= new ArrayList<DrugList>();
        sample_01.add(new DrugList(null,"薬品01",1000,"TEST1",new Date()));
        sample_01.add(new DrugList(null,"薬品02",1000,"TEST",new Date()));
        sample_01.add(new DrugList(null,"薬品03",2000,"TEST",new Date()));
        sample_01.add(new DrugList(null,"薬品04",4500,"TEST",new Date()));
        drugRepository.saveAll(sample_01);
    }
    @Test
    public void animalList(){ // 動物リスト
        List<Animal>  animal_list = animalRepository.findAll();
        System.out.println(animal_list);
    }
    @Test
    public void getSerial(){
        System.out.println(clinicService.serialCreator(1));
    }

    @Test
    public void searchState(){ // state check
        List<Invoice> invoices = clinicService.searchAllInvoice();
        Integer state_01=0,state_02=0,state_03 =0,state_99=0;
        List<Invoice> invoices_1 ;
        for(Invoice invoice:invoices){
            switch (invoice.getInvoiceState()){
                case 0:
                    state_01+=1;
                    continue;
                case 1:
                    state_02+=1;;
                    continue;
                case 99:
                    state_03+=1;;
                    continue;
                default:
                    state_99+=1;
                    continue;
            }
        }
        System.out.println(state_01+","+state_02+","+state_03+","+state_99);
    }
    @Test
    public void updateInvoice(){
        String invoice_serial = "F1H232621V";
        String visit_name = "ミルク2";
        String visit_phone = "08099991111";
        Integer meal = 1;
        Integer lodging = 1;
        Integer category = 1;
        Integer first_visit = 0;
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
            // save
        System.out.println(clinicService.updateBaseTotal(invoice));

    }



}
