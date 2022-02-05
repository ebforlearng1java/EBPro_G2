package jp.wintercat.veterinaryclinic.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;


/**
 * 請求書　ー　メイン
 */
@Entity
@Getter
@Setter
@DynamicUpdate
@Table(name = "invoice")
public class Invoice {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;
        @Column(name = "invoice_number",nullable = false)
        private String invoiceNumber;//請求番号
        @Column(name = "invoice_name",nullable = false)
        private String invoiceName;//請求名前
        @Column(name = "phone")
        private String phone; // 電話番号
        @Column(name = "create_invoice_date",nullable = false)
        private Date createInvoiceDate;//申請時間
        @Column(name = "update_invoice_date")
        private Date updateInvoiceDate;// 更新時間
        @Column(name = "invoice_state")
        private Integer invoiceState; // 状態　0 未処理　1 処理済　99 支払い済　-1 キャンセル済
        @Column(name = "payment_deadline")
        private Date paymentDeadline; // 支払い時間
        @Column(name = "total",nullable = false)
        private Integer total;//金額
        // --- --- --- --- ---　--- ---
        // 動物 類
        @ManyToOne(cascade = {CascadeType.DETACH},fetch = FetchType.EAGER)
        @JoinColumn(name = "a_id",nullable = false)
        private Animal animal;
        // カルテ 類
        @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.ALL,CascadeType.REMOVE},fetch = FetchType.EAGER)
        @MapsId
        private ClinicalRecords clinicalRecords;

        public Invoice() {}

        public Invoice(String invoiceNumber, String invoiceName, String phone, Date createInvoiceDate, Date updateInvoiceDate, Integer invoiceState, Date paymentDeadline, Integer total, Animal animal, ClinicalRecords clinicalRecords) {
                this.invoiceNumber = invoiceNumber;
                this.invoiceName = invoiceName;
                this.phone = phone;
                this.createInvoiceDate = createInvoiceDate;
                this.updateInvoiceDate = updateInvoiceDate;
                this.invoiceState = invoiceState;
                this.paymentDeadline = paymentDeadline;
                this.total = total;
                this.animal = animal;
                this.clinicalRecords = clinicalRecords;
        }


}
