package com.example.demo.DTO;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class ChefeMilitar {
    String dat_incorp;
    String dat_saida;
    String nome;
    @Id
    int codigo;
    String tipo;
    String org_dependente;
    int qtd_pessoas;
    String tipo_auxilio;
}
