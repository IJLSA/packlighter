package com.packlighter.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@RequiredArgsConstructor
public class PackList {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
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
                ", categories size=" + categories.size() +
                '}';
    }
}
