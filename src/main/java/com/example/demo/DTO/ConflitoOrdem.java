package com.example.demo.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ConflitoOrdem {

    String Nome_Conflito;
    Integer Mortes;
    Integer conflito_TIPO;

    public Integer getConflito_TIPO() {
        return conflito_TIPO;
    }

    public void setConflito_TIPO(Integer tipoConflito) {
        this.conflito_TIPO = tipoConflito;
    }

    @Id
    public String getNome_Conflito() {
        return Nome_Conflito;
    }

    public void setNome_Conflito(String nome_Conflito) {
        Nome_Conflito = nome_Conflito;
    }

    public Integer getMortes() {
        return Mortes;
    }

    public void setMortes(Integer mortes) {
        Mortes = mortes;
    }
}
