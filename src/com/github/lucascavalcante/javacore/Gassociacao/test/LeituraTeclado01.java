package com.github.lucascavalcante.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTeclado01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo: ");
        String nome = sc.nextLine();
        System.out.println(nome);
    }
}
