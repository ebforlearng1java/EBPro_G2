package jp.wintercat.veterinaryclinic.service;


import jp.wintercat.veterinaryclinic.entity.Animal;
import jp.wintercat.veterinaryclinic.entity.ClinicalRecords;
import jp.wintercat.veterinaryclinic.entity.DrugList;
import jp.wintercat.veterinaryclinic.entity.Invoice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Clinic Service 接口
 * main - service
 */
public interface ClinicService {
    // シリアル検索
    public Invoice searchInvoiceBySerialNumber(String serialNumber);
    // シリアル形成
    public String serialCreator(Integer category);
    // animal リスト
    public List<Animal> searchAnimalList();
    // animal id
    public Animal searchAnimalById(Integer id);
    // clinic record search by id
    public ClinicalRecords searchClinicalRecordByCid(Long cid);
    // 申請表セーブ
    public Invoice saveInvoiceApply(Invoice invoice);
    public Invoice saveInvoiceAndFlush(Invoice invoice);
    // 予約表検索
    public Integer searchInvoiceByStateReturnCount(Integer state);
    // 全ての予約表を検索
    public List<Invoice> searchAllInvoice();
    // 予約表状態検索
    public List<Invoice> searchInvoiceByState(Integer state);
    // ページ予約表を検索
    Page<Invoice> getPages(Pageable pageable);
    // 予約表検索
    Invoice getInvoiceByInvoiceId(Long id);
    // 料金計算
    Integer updateBaseTotal(Invoice invoice);
    // 薬品検索

}
