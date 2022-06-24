package com.base1.base1.controller;

import com.base1.base1.service.TbDadosBase1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "dados-1")
public class TbDadosBase1Controller {

    @Autowired
    private TbDadosBase1Service tbDadosBase1Service;

    @GetMapping(path = "/get-all")
    public ResponseEntity getAll(){
        var response = tbDadosBase1Service.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}
