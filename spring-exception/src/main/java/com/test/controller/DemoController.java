package com.test.controller;

import com.test.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/show")
    public String show(@RequestParam(value = "name",required = true)String name) throws FileNotFoundException {
        System.out.println("show running...");
        demoService.show1();
        return "index";
    }
}
