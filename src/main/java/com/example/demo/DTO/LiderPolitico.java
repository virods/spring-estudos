package com.example.demo.DTO;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class LiderPolitico {
    String descricao_textual;
    @Id
    int cod;
    String nome;
    int fk_Grupos_Armados_COD_GRUPO_ARM;

    public LiderPolitico(String descricao_textual, int cod, String nome, int fk_Grupos_Armados_COD_GRUPO_ARM) {
        this.descricao_textual = descricao_textual;
        this.cod = cod;
        this.nome = nome;
        this.fk_Grupos_Armados_COD_GRUPO_ARM = fk_Grupos_Armados_COD_GRUPO_ARM;
    }

    public LiderPolitico() {

    }
}
