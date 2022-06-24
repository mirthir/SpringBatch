package com.base1.base1.repository;

import com.base1.base1.model.TbDadosBase1;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TbDadosBase1Repository extends JpaRepository<TbDadosBase1, Integer> {

    List<TbDadosBase1> findByNome(String nome);

}
