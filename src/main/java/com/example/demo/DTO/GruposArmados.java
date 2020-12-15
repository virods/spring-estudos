package com.example.demo.DTO;


import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class GruposArmados {
    public String dat_incorp;
    public String dat_saida;
    public Integer cod_grupo_arm;
    public String nom_grupo_arm;
    public Integer num_divisao;
    public String lider_politico;
    public Integer num_baixas;

    public String getDat_incorp() {
        return dat_incorp;
    }

    public void setDat_incorp(String dat_incorp) {
        this.dat_incorp = dat_incorp;
    }

    public String getDat_saida() {
        return dat_saida;
    }

    public void setDat_saida(String dat_saida) {
        this.dat_saida = dat_saida;
    }

    @Id
    public Integer getCod_grupo_arm() {
        return cod_grupo_arm;
    }

    public void setCod_grupo_arm(Integer cod_grupo_arm) {
        this.cod_grupo_arm = cod_grupo_arm;
    }

    public String getNom_grupo_arm() {
        return nom_grupo_arm;
    }

    public void setNom_grupo_arm(String nom_grupo_arm) {
        this.nom_grupo_arm = nom_grupo_arm;
    }

    public Integer getNum_divisao() {
        return num_divisao;
    }

    public void setNum_divisao(Integer num_divisao) {
        this.num_divisao = num_divisao;
    }


    public String getLider_politico() {
        return lider_politico;
    }

    public void setLider_politico(String lider_politico) {
        this.lider_politico = lider_politico;
    }

    public Integer getNum_baixas() {
        return num_baixas;
    }

    public void setNum_baixas(Integer num_baixas) {
        this.num_baixas = num_baixas;
    }



}
