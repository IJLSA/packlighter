package com.packlighter.service;

import com.packlighter.model.ItemPurpose;
import com.packlighter.model.Measurement;
import com.packlighter.model.PackCategory;
import com.packlighter.model.PackItem;
import com.packlighter.model.PackList;
import com.packlighter.repository.PackCategoryRepository;
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
    private PackCategoryRepository packCategoryRepository;

    @Autowired
    private PackListRepository packListRepository;

    // TODO Not sure if this works didn't test it
    public void addItem(PackItem packItem) {
        packItemRepository.save(packItem);
    }

    public void addList(PackList packList) {
        packListRepository.save(packList);
    }

    public PackList findPackListByName(String name) {
        return packListRepository.findByListName(name).get();
    }

    public void addCategory(PackCategory packCategory) {
        packCategoryRepository.save(packCategory);
    }

    // Will remove, just an attempt to persist all models
    public void test() {
        PackList packList = new PackList();
        PackCategory packCategory = new PackCategory();
        PackItem packItem = new PackItem();
        packItem.setDescription("New Description");
        packItem.setMeasurement(Measurement.GRAM);
        packItem.setName("New Name");
        packItem.setPurpose(ItemPurpose.CONSUMABLE);
        packItem.setWeight(55.9);
        packItem.setQuantity(4);
        packItem.setPackCategory(packCategory);
        packCategory.setPackItems(Arrays.asList(packItem));
        packList.setBaseWeight(55.3);
        packList.setListName("Listy");
        packList.setTotalWeight(1234.3);
        packList.setCategories(Arrays.asList(packCategory));
        packCategory.setPackList(packList);
        packItemRepository.save(packItem);
    }

    //TODO add an item to category
    public void addItemtoCategory(PackCategory packCategory, PackItem packItem) {
//        packCategory.getCategoryId();
//        packCategoryRepository.save()
    }
}
