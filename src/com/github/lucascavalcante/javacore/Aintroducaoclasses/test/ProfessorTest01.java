package com.github.lucascavalcante.javacore.Aintroducaoclasses.test;

import com.github.lucascavalcante.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Raimundo";
        professor.sexo = 'M';
        professor.idade = 46;

        System.out.println("Nome: " + professor.nome + " Sexo: " + professor.sexo + " Idade: " + professor.idade);
    }
}
