package com.packlighter.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

@RequiredArgsConstructor
@Getter
@Setter
//@ToString
@Entity
//@Data
public class PackCategory {

    //    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String categoryId;
    @OneToMany(mappedBy = "packCategory")
    private List<PackItem> packItems;
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "list_id")
    private PackList packList;

    @Override
    public String toString() {
        return "PackCategory{" +
                "categoryId='" + categoryId + '\'' +
                ", packItems=" + packItems +
                ", packList=" + packList +
                '}';
    }
}
