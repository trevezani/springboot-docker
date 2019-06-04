package br.com.trevezani.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VersaoController {

    @RequestMapping("/")
    public String index() {
        return "v1.00";
    }	
	
}
