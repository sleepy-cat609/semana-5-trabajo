package com.mycompany.semana.p2;

import java.util.Scanner;

public class Semana5p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingresa tu edad: ");
            int edad = Integer.parseInt(sc.nextLine());

            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser negativa.");
            }

            System.out.println("Edad registrada: " + edad);
        } catch (NumberFormatException e) {
            System.out.println("¡Error! Debes ingresar un número válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("¡Error! " + e.getMessage());
        }
    }
}
