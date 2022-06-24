package com.springbatch.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DadosBaseDTO {
    private int id;
    private String nome;
    private String descricao;
    private String email;
    private String senha;
}
