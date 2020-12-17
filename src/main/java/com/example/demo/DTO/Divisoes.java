package com.example.demo.DTO;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Divisoes {
    @Id
    int num_divisao;
    int qtd_barcos;
    int qtd_tanques;
    int qtd_avioes;
    int qtd_homens;
    int num_baixas;
    int fk_Grupos_Armados_COD_GRUPO_ARM;
    int fk_Divisao_COD_CHEFE_MIL;
}
