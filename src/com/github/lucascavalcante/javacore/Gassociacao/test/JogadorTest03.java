package com.github.lucascavalcante.javacore.Gassociacao.test;

import com.github.lucascavalcante.javacore.Gassociacao.dominio.Jogador;
import com.github.lucascavalcante.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafu");
        Time time = new Time("Brasil");

        Jogador jogador2 = new Jogador("Marcelo");
        jogador1.setTime(time);

        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        time.setJogador(jogadores);

        System.out.println("--- Jogador ---");
        jogador1.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
