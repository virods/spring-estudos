package com.example.demo.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Conflito {

    String nome;
    Integer num_feridos;
    String paises_afet;
    Integer cod_num;
    String religioes_afet;
    String mat_disp;
    String reg_afet;
    String etnias_enf;
    Integer conflito_tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNum_feridos() {
        return num_feridos;
    }

    public void setNum_feridos(Integer num_feridos) {
        this.num_feridos = num_feridos;
    }

    public String getPaises_afet() {
        return paises_afet;
    }

    public void setPaises_afet(String paises_afet) {
        this.paises_afet = paises_afet;
    }

    @Id
    public Integer getCod_num() {
        return cod_num;
    }

    public void setCod_num(Integer cod_num) {
        this.cod_num = cod_num;
    }

    public String getReligioes_afet() {
        return religioes_afet;
    }

    public void setReligioes_afet(String religioes_afet) {
        this.religioes_afet = religioes_afet;
    }

    public String getMat_disp() {
        return mat_disp;
    }

    public void setMat_disp(String mat_disp) {
        this.mat_disp = mat_disp;
    }

    public String getReg_afet() {
        return reg_afet;
    }

    public void setReg_afet(String reg_afet) {
        this.reg_afet = reg_afet;
    }

    public String getEtnias_enf() {
        return etnias_enf;
    }

    public void setEtnias_enf(String etnias_enf) {
        this.etnias_enf = etnias_enf;
    }

    public Integer getConflito_tipo() {
        return conflito_tipo;
    }

    public void setConflito_tipo(Integer conflito_tipo) {
        this.conflito_tipo = conflito_tipo;
    }


}
