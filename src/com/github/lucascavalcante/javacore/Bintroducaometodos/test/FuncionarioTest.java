package com.github.lucascavalcante.javacore.Bintroducaometodos.test;

import com.github.lucascavalcante.javacore.Bintroducaometodos.dominio.Funcionario;

import java.util.Scanner;

public class FuncionarioTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        f.setNome(nome);
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        f.setIdade(idade);
        double[] salarios = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite seu %dº salário: ", i+1);
            double salario = sc.nextDouble();
            salarios[i] = salario;
        }
        f.setSalarios(salarios);
        f.retornaDados();
        f.mediaSalario();
    }
}
