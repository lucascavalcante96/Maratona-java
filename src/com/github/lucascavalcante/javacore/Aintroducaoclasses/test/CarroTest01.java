package com.github.lucascavalcante.javacore.Aintroducaoclasses.test;

import com.github.lucascavalcante.javacore.Aintroducaoclasses.dominio.Carro;

import java.util.ArrayList;
import java.util.Scanner;

public class CarroTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char verificador = 's';
        ArrayList<Carro> modelosDeCarros = new ArrayList<>();
        while (true) {
            if  (verificador != 's') {
                break;
            }
            Carro carro = new Carro();
            System.out.print("Digite a marca do carro ");
            String marca = sc.nextLine();
            carro.marca = marca;

            System.out.print("Digite o modelo do carro ");
            String modelo = sc.nextLine();
            carro.modelo = modelo;

            System.out.print("Digite o ano do carro: ");
            int ano = sc.nextInt();
            carro.ano = ano;
            modelosDeCarros.add(carro);

            System.out.print("Deseja adicionar outro carro? [s/n] ");

            verificador = sc.next().charAt(0);
            sc.nextLine();
        }
        System.out.println();
        System.out.println("Carros adicionados com sucesso!");
        System.out.println();
        for (Carro carro : modelosDeCarros) {
            System.out.println("Marca: " + carro.marca + ", Modelo: " + carro.modelo + ", Ano: " + carro.ano);
        }
        sc.close();
    }
}
