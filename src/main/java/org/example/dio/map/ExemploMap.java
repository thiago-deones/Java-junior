package org.example.dio.map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.4);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        //substituir o consumo do gol por 15,2
        carrosPopulares.put("Gol", 15.2);

        System.out.println(carrosPopulares);

        // conferir se o modelo tucson está no dicionário
        System.out.println(carrosPopulares.containsKey("tucson"));
        System.out.println(carrosPopulares.containsKey("Uno"));
        System.out.println(carrosPopulares.get("Uno"));

        //exibir os modelos
        System.out.println(carrosPopulares.keySet());

        //exibir os consumos
        System.out.println(carrosPopulares.values());

        //carro mais eficiente
        double carroMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modelMaisEficiente = "";

        //Apenas o valor do maior consumo
        Double maiorConsumo = Collections.max(carrosPopulares.values());
        System.out.println("maior consumo: " + maiorConsumo);

        System.out.println("");
        //carro mais eficiente (Modelo + Consumo)
        Map.Entry<String, Double> maisEficiente = Collections.max(
                carrosPopulares.entrySet(),
                Map.Entry.comparingByValue()
        );
        System.out.println("Carro mais eficiente: " + maisEficiente.getKey() + " com " + maisEficiente.getValue() + " km/l");

        //menor eficiencia
        Double menorConsumo = Collections.min(carrosPopulares.values());
        System.out.println("menor consumo: " + menorConsumo);

        //carro menos eficiente
        Map.Entry<String, Double> menosEficiente = Collections.min(
                carrosPopulares.entrySet(),
                Map.Entry.comparingByValue()
        );
        System.out.println("maior consumo: " + menosEficiente);


        //soma dos consumos
        System.out.println("Exibir soma dos consumos:");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        //mostrar a media
        System.out.println("Media de consumo " + soma/carrosPopulares.size());

        //remover carros com consumo de 15,6
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.4);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);
        System.out.println(carrosPopulares);

        System.out.println("Ordenado pelo modelo");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);

    }
}
