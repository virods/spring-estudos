package com.example.demo.commons;

public enum ConflitoEnum {

    RELIGIOSO(1, "Religioso"),
    ECONOMICO(2, "economico"),
    TERRITORIAL(3, "territorial"),
    ETNIA(4, "etnia");

    int cod;
    String tipo;

    ConflitoEnum(int cod, String tipo) {
        this.cod = cod;
        this.tipo = tipo;
    }
}
