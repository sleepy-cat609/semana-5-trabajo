package com.mycompany.semana.tecnicas;

public class Semana5Tecnicas {

    // Sobrecarga de métodos para conversión de unidades
    public static double convertir(double metros) {
        return metros / 1000; // metros a kilómetros
    }

    public static double convertir(int metros, int centimetros) {
        return metros + (centimetros / 100.0); // metros + cm a metros
    }

    public static void main(String[] args) {
        System.out.println("500 metros = " + convertir(500) + " km");
        System.out.println("2 metros y 50 cm = " + convertir(2, 50) + " m");
    }
}
