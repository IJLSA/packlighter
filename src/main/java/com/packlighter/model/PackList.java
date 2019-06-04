package com.packlighter.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
//@Data
@Entity
public class PackList {

    //	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String listId;
    @Column
    private String listName;
    @Column
    private Double baseWeight;
    @Column
    private Double totalWeight;
    @OneToMany(mappedBy = "packList")
    private List<PackCategory> categories;

    @Override
    public String toString() {
        return "PackList{" +
                "listId='" + listId + '\'' +
                ", listName='" + listName + '\'' +
                ", baseWeight=" + baseWeight +
                ", totalWeight=" + totalWeight +
                ", categories=" + categories +
                '}';
    }
}
