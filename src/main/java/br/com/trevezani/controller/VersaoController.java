package br.com.trevezani.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersaoController {

    @RequestMapping("/versao")
    public String index() {
        return "v1.00";
    }	
	
}
