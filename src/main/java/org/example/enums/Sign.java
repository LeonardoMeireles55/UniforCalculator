package org.example.enums;

//Feito por: Alyne.

public enum Sign {
    MULTIPLY("*"),
    DIVISION("/"),
    SUM("+"),
    MINUS("-"),
    MODULUS("%"),
    POWER("^"),
    ROOT("√");

    public final String sign;

    Sign(String sign) {
        this.sign = sign;
    }
}
