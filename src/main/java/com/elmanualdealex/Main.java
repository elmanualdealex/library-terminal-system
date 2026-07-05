package com.elmanualdealex;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        double e = 2.72818;

        double resultado = x + y + e;

        System.out.println("La suma es:");
        System.out.printf("%.2f%n", resultado);

        if (resultado >= 50) {
            System.out.println("Es igual o mayor a 50");
        } else {
            System.out.println("Es menor a 50");
        }
    }
}