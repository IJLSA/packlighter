package com.packlighter.model;

import javax.persistence.*;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@RequiredArgsConstructor
public class PackItem {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String itemId;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private Double weight;
    @Column
    @Enumerated(EnumType.STRING)
    private Measurement measurement;
    @Column
    @Enumerated(EnumType.STRING)
    private ItemPurpose purpose;
    @Column
    private int quantity;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private PackCategory packCategory;

    @Override
    public String toString() {
        return "PackItem{" +
                "itemId='" + itemId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", weight=" + weight +
                ", measurement=" + measurement +
                ", purpose=" + purpose +
                ", quantity=" + quantity +
                ", packCategory=" + packCategory +
                '}';
    }
}
