package com.mycompany.semana5.p3;

import java.util.ArrayList;

public class Semana5P3 {
    public static void main(String[] args) {
        ArrayList<Double> temperaturas = new ArrayList<>();
        temperaturas.add(22.5);
        temperaturas.add(24.0);
        temperaturas.add(21.8);
        temperaturas.add(23.2);

        System.out.println("Historial de temperaturas:");
        for (int i = 0; i < temperaturas.size(); i++) {
            System.out.println("Día " + (i + 1) + ": " + temperaturas.get(i) + " °C");
        }

        double suma = 0;
        for (double t : temperaturas) {
            suma += t;
        }
        System.out.printf("Temperatura promedio: %.2f °C\n", suma / temperaturas.size());
    }
}
