package com.github.lucascavalcante.javacore.Gassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime() {
        if (this.jogadores != null){
            for (Jogador jogador : this.jogadores) {
                System.out.println(jogador.getNome());
            }
        } else {
            return;
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogador() {
        return jogadores;
    }

    public void setJogador(Jogador[] jogador) {
        this.jogadores = jogador;
    }
}
