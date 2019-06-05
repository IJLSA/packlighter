package com.packlighter.controller;

import com.packlighter.model.PackCategory;
import com.packlighter.model.PackItem;
import com.packlighter.model.PackList;
import com.packlighter.service.PackService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class PackController {

    @Autowired
    public PackService packService;

    // TODO Not sure if this works didn't test it
    @PostMapping(value = "/item")
    @ResponseStatus(HttpStatus.OK)
    public PackItem addItem(@RequestBody PackItem packItem) {
        packService.addItem(packItem);
        return packItem;
    }

    @PostMapping(value = "/list")
    @ResponseStatus(HttpStatus.OK)
    public PackList addItem(@RequestBody PackList packList) {
        packService.addList(packList);
        return packList;
    }

    @PostMapping(value = "/addCategoryToList")
    @ResponseStatus(HttpStatus.OK)
    public PackCategory addCategoryToPackList(@RequestParam("listName") String listName,
                                              @RequestBody PackCategory packCategory) {
        PackCategory newCategory = packCategory;
        packCategory.setPackList(
                packService.findPackListByName(listName)
        );
        packService.addCategory(newCategory);

        return newCategory;
    }

    // Will remove, just an attempt to persist all models
    @GetMapping(value = "/pack", produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public String testPack() {
        packService.test();
        return "success";
    }
}
