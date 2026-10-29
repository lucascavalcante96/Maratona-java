package com.github.lucascavalcante.javacore.Bintroducaometodos.test;

import com.github.lucascavalcante.javacore.Bintroducaometodos.dominio.Funcionario;

import java.util.Scanner;

public class FuncionarioTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();
        System.out.print("Digite seu nome: ");
        f.nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        f.idade = sc.nextInt();
        f.salarios = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite seu %dº salário: ", i+1);
            double salario = sc.nextDouble();
            f.salarios[i] = salario;
        }

        f.retornaDados();
        f.mediaSalario();
    }
}
