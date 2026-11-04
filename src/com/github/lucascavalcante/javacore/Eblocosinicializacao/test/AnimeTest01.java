package com.github.lucascavalcante.javacore.Eblocosinicializacao.test;

import com.github.lucascavalcante.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime  anime = new Anime();

        for (int epsodio : anime.getEpsodios()){
            System.out.print(epsodio + " ");
        }
    }
}
