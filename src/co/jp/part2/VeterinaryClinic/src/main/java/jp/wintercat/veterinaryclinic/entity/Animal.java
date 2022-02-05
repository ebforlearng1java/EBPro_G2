package jp.wintercat.veterinaryclinic.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * 動物類
 */
@Entity
@Setter
@Getter
@Table(name = "animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aid")
    private Integer aid;
    @Column(name = "name")
    private String name;
    @Column(name = "special_amount")
    private Integer specialAmount;
    // --- --- --- --- ---　--- ---
    @OneToMany(cascade={CascadeType.ALL},fetch=FetchType.EAGER)
    @JoinColumn(name = "a_id")
    private List<Invoice> invoice; // 一对多个请求表

    public Animal() {}
    public Animal(Integer aid, String name, Integer specialAmount) {
        this.aid = aid;
        this.name = name;
        this.specialAmount = specialAmount;
    }

}
