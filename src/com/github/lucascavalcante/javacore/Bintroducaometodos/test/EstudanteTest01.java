package com.github.lucascavalcante.javacore.Bintroducaometodos.test;

import com.github.lucascavalcante.javacore.Bintroducaometodos.dominio.Estutante;
import com.github.lucascavalcante.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estutante estutante1 = new Estutante();
        Estutante estutante2 = new Estutante();
        ImpressoraEstudante imprime = new ImpressoraEstudante();

        estutante1.nome = "Lucas";
        estutante1.idade = 18;
        estutante1.sexo = 'M';

        estutante2.nome = "Maria";
        estutante2.idade = 19;
        estutante2.sexo = 'F';

        imprime.imprimir(estutante1);
        System.out.println("--------------------------");
        imprime.imprimir(estutante2);
    }
}
