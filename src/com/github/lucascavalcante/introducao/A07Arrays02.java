package com.github.lucascavalcante.introducao;

public class A07Arrays02 {
    public static void main(String[] args) {
        String [] nomes = new String[3];
        nomes[0] = "lucas";
        nomes[1] = "Maria";
        nomes[2] = "Jose";

        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
