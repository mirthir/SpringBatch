package com.baseexterna.baseExterna.servico;

import com.baseexterna.baseExterna.dto.DadosExternoDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import java.util.Arrays;
import java.util.List;

@Service
public class ServicoExternoServiceImpl implements ServicoExternoService{

    @Autowired
    private RestTemplate restTemplate;

    final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public List<DadosExternoDTO> findAll() {

        DadosExternoDTO[] dados = new DadosExternoDTO[0];

        try {
            String json = restTemplate.getForObject("servico-externo/recupera-infos", String.class);
            dados = objectMapper.readValue(json, DadosExternoDTO[].class);
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return Arrays.asList(dados);
    }
}
