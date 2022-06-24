package com.base2.base2.service.impl;

import com.base2.base2.dto.DadosBase1DTO;
import com.base2.base2.model.TbDadosBase2;
import com.base2.base2.model.TbDadosBase3;
import com.base2.base2.repository.TbDadosBase2Repository;
import com.base2.base2.repository.TbDadosBase3Repository;
import com.base2.base2.service.TbDadosBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbDadosBaseServiceImpl implements TbDadosBaseService {

    @Autowired
    private TbDadosBase2Repository tbDadosBase2Repository;
    @Autowired
    private TbDadosBase3Repository tbDadosBase3Repository;

    @Override
    public void save(DadosBase1DTO dto) {

        var dadosBase2 = TbDadosBase2.builder()
                        .nome(dto.getNome())
                                .descricao(dto.getDescricao())
                                        .build();

        var dadosBase3 = TbDadosBase3.builder()
                        .email(dto.getEmail())
                                .senha(dto.getSenha())
                                        .build();

        tbDadosBase2Repository.save(dadosBase2);
        tbDadosBase3Repository.save(dadosBase3);

    }

}
