package br.com.trevezani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VersaoController {

    @RequestMapping("versao")
    public String versao() {
        return "v1.00";
    }	
	
}
