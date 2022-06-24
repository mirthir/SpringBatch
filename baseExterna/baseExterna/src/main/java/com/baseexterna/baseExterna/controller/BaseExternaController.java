package com.baseexterna.baseExterna.controller;

import com.baseexterna.baseExterna.servico.ServicoExternoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "base-externa")
public class BaseExternaController {

    @Autowired
    private ServicoExternoService servicoExternoService;

    @GetMapping(path = "get-all")
    public ResponseEntity getAllDadosServicoExterno(){
        var response = servicoExternoService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}
