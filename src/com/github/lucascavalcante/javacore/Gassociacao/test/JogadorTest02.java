package com.github.lucascavalcante.javacore.Gassociacao.test;

import com.github.lucascavalcante.javacore.Gassociacao.dominio.Jogador;
import com.github.lucascavalcante.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Time time = new Time("Barcelona");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
