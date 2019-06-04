package com.packlighter.service;

import com.packlighter.model.ItemPurpose;
import com.packlighter.model.Measurement;
import com.packlighter.model.PackCategory;
import com.packlighter.model.PackItem;
import com.packlighter.model.PackList;
import com.packlighter.repository.PackItemRepository;
import com.packlighter.repository.PackListRepository;
import java.util.Arrays;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PackService {

    @Autowired
    private PackItemRepository packItemRepository;
    @Autowired
    private PackListRepository packListRepository;

    public void test() {
        PackList packList = new PackList();
        PackCategory packCategory = new PackCategory();
        PackItem packItem = new PackItem();
        packItem.setDescription("Description");
        packItem.setMeasurement(Measurement.GRAM);
        packItem.setName("Name");
        packItem.setPurpose(ItemPurpose.CONSUMABLE);
        packItem.setWeight(55.9);
        packItem.setQuantity(4);
        packItem.setPackCategory(packCategory);
        packCategory.setPackItems(Arrays.asList(packItem));
        packList.setBaseWeight(55.3);
        packList.setListName("Listy");
        packList.setTotalWeight(1234.3);
        packList.setCategories(Arrays.asList(packCategory));

        packItemRepository.save(packItem);

    }
}
