package com.github.lucascavalcante.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] epsodios;
    static {
        epsodios = new int[100];
        for (int i = 0; i < epsodios.length; i++) {
            epsodios[i] = i + 1;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }
    public Anime() {

        for(int epsodio : Anime.epsodios){
            System.out.print(epsodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpsodios() {
        return epsodios;
    }

}
