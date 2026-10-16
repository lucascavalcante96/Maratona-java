package com.github.lucascavalcante.introducao;

public class A08ArraysMultidimencionais01 {
    public static void main(String[] args) {
        // Planilha 3x3: 3 alunos (linhas) e 3 provas (colunas)
        int[][] notas = new int[3][3];
        // Linha 0 -> Ana
        notas[0][0] = 8;
        notas[0][1] = 7;
        notas[0][2] = 9;
        // Linha 1 -> Bruno
        notas[1][0] = 6;
        notas[1][1] = 8;
        notas[1][2] = 7;
        // Linha 2 -> Carla
        notas[2][0] = 9;
        notas[2][1] = 10;
        notas[2][2] = 8;
        // Cabeçalho da "planilha"
        System.out.println("P1\tP2\tP3");
        // Percorre cada linha (aluno)
        for (int i = 0; i < notas.length; i++) {
            // Percorre cada coluna (prova) da linha atual
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + "\t");
            }
            // Pula para a próxima linha da tabela
            System.out.println();
        }
        System.out.println("-------------------");
        System.out.println("P1\tP2\tP3");
        //fazendo um for each
        for (int [] arrayBase : notas) {
            for (int nota : arrayBase) {
                System.out.print(nota + "\t");
            }
            System.out.println();
        }
    }
}
