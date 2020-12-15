package com.example.demo.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GruposArmadosTraficantesDTO {
    String nome;

    Integer cod_grupo_arm;
    String nome_arma;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Id
    public Integer getCod_grupo_arm() {
        return cod_grupo_arm;
    }

    public void setCod_grupo_arm(Integer cod_grupo_arm) {
        this.cod_grupo_arm = cod_grupo_arm;
    }

    public String getNome_arma() {
        return nome_arma;
    }

    public void setNome_arma(String nome_arma) {
        this.nome_arma = nome_arma;
    }
}
