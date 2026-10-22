package com.github.lucascavalcante.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprimir(Estutante estutante) {
        System.out.println("Nome: " + estutante.nome);
        System.out.println("Idade: " + estutante.idade);
        System.out.println("Sexo: " + estutante.sexo);
    }
}
