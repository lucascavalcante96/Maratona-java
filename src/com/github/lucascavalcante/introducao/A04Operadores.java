package com.github.lucascavalcante.introducao;

public class A04Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        int soma = numero2 +  numero1;
        int subtracao = numero2 - numero1;
        int multiplicacao = numero2 * numero1;
        double divisao = (double) numero1 / numero2;

        double resto = numero2 % 7;

        //OPperadores Lógico

        int idade = 17;
        boolean tituloDeEleitor = false;
        boolean podeVotar = idade >= 16 && tituloDeEleitor == true;

        boolean estudante = false;
        boolean maiorQue65 = true;

        boolean direitoGratuidade = estudante == true || maiorQue65 == true;

        double bonus = 2000;
        bonus += 800;
        System.out.println(bonus);

    }
}
