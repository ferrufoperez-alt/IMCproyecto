package com.imcproyecto;

public class IMC {
    public double peso;
    public double altura;

    public double mostrarIMC() {
        return peso / (altura * altura);
    }
}