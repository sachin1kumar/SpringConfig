package com.spring.config.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MyController {

    @Value("${myCustomMessage: default}")
    private String message;

    @Value("${myList.values}")
    private List<String> listValues;

    @Value("#{${dbValues}}")
    private Map<String, String> dbValues;

    @Autowired
    private DbSetting dbSetting;

    @GetMapping("/message")
    public String getMessage() {
        return message + ":" + listValues + ":" + dbValues +":" + dbSetting.getName() +":"+dbSetting.getPass()+":"+
                dbSetting.getPort();
    }
}
