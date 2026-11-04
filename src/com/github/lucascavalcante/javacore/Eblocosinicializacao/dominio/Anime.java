package com.github.lucascavalcante.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] epsodios;
    {
        epsodios = new int[100];
        for (int i = 0; i < epsodios.length; i++) {
            epsodios[i] = i + 1;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }
    public Anime() {

        for(int epsodio : epsodios){
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

    public void setEpsodios(int[] epsodios) {
        this.epsodios = epsodios;
    }
}
