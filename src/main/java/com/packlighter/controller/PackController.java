package com.packlighter.controller;

import com.packlighter.service.PackService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class PackController {


    @Autowired
    public PackService packService;

    @GetMapping("/pack")
    public String testPack() {
        packService.test();
        return "yessssss";
    }
}
