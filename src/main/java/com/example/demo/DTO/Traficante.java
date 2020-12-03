package com.example.demo.DTO;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Traficante {

    private String nome;
    private int qtd_tipo_arma;
    private String nome_arma;
    private int cap_destrutiva;





    @Id
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd_tipo_arma() {
        return qtd_tipo_arma;
    }

    public void setQtd_tipo_arma(int qtd_tipo_arma) {
        this.qtd_tipo_arma = qtd_tipo_arma;
    }

    public String getNome_arma() {
        return nome_arma;
    }

    public void setNome_arma(String nome_arma) {
        this.nome_arma = nome_arma;
    }

    public int getCap_destrutiva() {
        return cap_destrutiva;
    }

    public void setCap_destrutiva(int cap_destrutiva) {
        this.cap_destrutiva = cap_destrutiva;
    }

}
