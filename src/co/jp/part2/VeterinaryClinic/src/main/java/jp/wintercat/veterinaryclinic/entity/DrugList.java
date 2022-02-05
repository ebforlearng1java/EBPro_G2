package jp.wintercat.veterinaryclinic.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * 薬物類
 */
@Entity
@Getter
@Setter
@Table(name = "drug_list")
public class DrugList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "drug_name",nullable = false)
    private String drugName;
    @Column(name = "amount",nullable = false)
    private Integer amount;
    @Column(name = "serial",nullable = false)
    private String drug_serial;
    @Column(name = "updateTime",nullable = false)
    private Date updateTime;
    @ManyToMany(cascade = {CascadeType.ALL},fetch=FetchType.LAZY)
    @JoinColumn(name = "drug_id")
    private List<ClinicalRecords> clinicalRecords;
    // --- --- --- --- ---　--- ---
    public DrugList() {}

    public DrugList(Integer id, String drugName, Integer amount, String drug_serial, Date updateTime) {
        this.id = id;
        this.drugName = drugName;
        this.drug_serial = drug_serial;
        this.amount = amount;
        this.updateTime = updateTime;
    }


}
