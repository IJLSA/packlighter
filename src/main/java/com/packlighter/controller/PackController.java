package com.packlighter.controller;

import com.packlighter.model.PackItem;
import com.packlighter.model.PackList;
import com.packlighter.service.PackService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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

    // Will remove, just an attempt to persist all models
    @GetMapping(value = "/pack", produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public String testPack() {
        packService.test();
        return "success";
    }
}
