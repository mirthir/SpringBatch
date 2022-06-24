package com.base2.base2.controller;

import com.base2.base2.dto.DadosBase1DTO;
import com.base2.base2.service.TbDadosBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "dados-2")
public class TbDadosBaseController {

    @Autowired
    private TbDadosBaseService tbDadosBaseService;

    @PostMapping(path = "save")
    public ResponseEntity save(@RequestBody DadosBase1DTO dto){
        tbDadosBaseService.save(dto);

        return ResponseEntity.status(HttpStatus.OK).body("Dados salvos com sucesso");

    }

}
