package com.jk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Controller
public class TextController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("selectOrder")
    @ResponseBody
    public Map<String, Object> selectOrder() {
        Map forObject = restTemplate.getForObject("http://service-order/selectOrder", Map.class);
        return forObject;
    }
}

