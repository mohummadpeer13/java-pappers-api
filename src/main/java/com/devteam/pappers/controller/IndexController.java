package com.devteam.pappers.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.ui.Model;

import com.devteam.pappers.entity.Society;

@Controller
public class IndexController {
    @Value("${pappers.token}")
    public String PAPPERS_TOKEN;

    @Value("${pappers.url}")
    public String PAPPERS_URL;

    @RequestMapping("/search")
    public String Siren(@RequestParam(value = "siren", required = false) String siren, Model model) {

        RestTemplate restTemplete = new RestTemplate();
        Society society = restTemplete.getForObject(PAPPERS_URL + PAPPERS_TOKEN + "siren=" + siren, Society.class);

        model.addAttribute("society", society);
        return "result";
    }
}
