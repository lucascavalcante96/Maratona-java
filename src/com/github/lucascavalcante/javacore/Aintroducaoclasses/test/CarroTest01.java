package com.github.lucascavalcante.javacore.Aintroducaoclasses.test;

import com.github.lucascavalcante.javacore.Aintroducaoclasses.dominio.Carro;

import java.util.ArrayList;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "BMW";
        carro1.modelo = "X6";
        carro1.ano = 2026;

        Carro carro2 = new Carro();
        carro2.marca = "Mercedes";
        carro2.modelo = "C200";
        carro2.ano = 2027;

        ArrayList<Carro> modelosDeCarros = new ArrayList<>();
        modelosDeCarros.add(carro1);
        modelosDeCarros.add(carro2);

        for (Carro carro : modelosDeCarros) {
            System.out.println("Marca: " + carro.marca + ", Modelo: " + carro.modelo + ", Ano: " + carro.ano);
        }
    }
}
