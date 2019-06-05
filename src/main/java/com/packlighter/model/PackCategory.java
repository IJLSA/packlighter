package com.packlighter.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@RequiredArgsConstructor
public class PackCategory {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String categoryId;
    @OneToMany(mappedBy = "packCategory")
    private List<PackItem> packItems;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "list_id")
    private PackList packList;

    @Override
    public String toString() {
        return "PackCategory{" +
                "categoryId='" + categoryId + '\'' +
                ", packItems=" + packItems.size() +
                ", packList name=" + packList.getListName() +
                '}';
    }
}
