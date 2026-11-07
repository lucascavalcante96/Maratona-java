package com.github.lucascavalcante.javacore.Fmodificadorestatico.test;

import com.github.lucascavalcante.javacore.Fmodificadorestatico.dominio.Escola;
import com.github.lucascavalcante.javacore.Fmodificadorestatico.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Mario");
        Professor[] professores = {professor};
        Escola escola = new Escola("Escola ABC", professores);
        escola.imprime();
    }
}
