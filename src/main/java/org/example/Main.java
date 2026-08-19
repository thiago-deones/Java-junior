package org.example;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Double> salarioPj = List.of(8000.0, 12000.0, 5000.0, 15000.0,10500.0);

        double totalImpostoRetido = 0.0;

        for (double salario : salarioPj ){
            if(salario > 10000){
                totalImpostoRetido += 1500;
            }
        }

        System.out.printf("Total de Imposto Retido: R$%.2f", totalImpostoRetido);
    }
}