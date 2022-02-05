package jp.wintercat.veterinaryclinic.repository;

import jp.wintercat.veterinaryclinic.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


/**
 *  請求書 Repository
 */
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,Long> {

    // 請求書検索
    List<Invoice> findAll();
    // 請求書検索　シリアル (invoiceNumber Number)
    Invoice findInvoiceByInvoiceNumber(String invoiceNumber);
    // 請求書検索　ID
    Invoice findInvoiceById(Long id);
    // 名前検索
    List<Invoice> findInvoiceByInvoiceName(String invoiceName);
    // State 検索 // State == 0 and State == 1 検索　「状態　0 未処理　1 処理済　99 支払い済　-1 キャンセル済」
    List<Invoice> findInvoicesByInvoiceState(Integer state);
    // update total
    @Transactional
    @Modifying
    @Query("update Invoice invoice set invoice.total=?1 where invoice.id=?2")
    void updateInvoiceTotal(Integer total,Long id);
    // update state
    @Transactional
    @Modifying
    @Query("update  Invoice  invoice set invoice.invoiceState=?1 where invoice.id=?2")
    void updateInvoiceState(Integer state,Long id);
}
