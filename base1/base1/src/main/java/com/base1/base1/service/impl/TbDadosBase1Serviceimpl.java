package com.base1.base1.service.impl;

import com.base1.base1.model.TbDadosBase1;
import com.base1.base1.repository.TbDadosBase1Repository;
import com.base1.base1.service.TbDadosBase1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbDadosBase1Serviceimpl implements TbDadosBase1Service {

    @Autowired
    private TbDadosBase1Repository tbDadosBase1Repository;

    @Override
    public List<TbDadosBase1> findAll() {
        return tbDadosBase1Repository.findAll();
    }
}
