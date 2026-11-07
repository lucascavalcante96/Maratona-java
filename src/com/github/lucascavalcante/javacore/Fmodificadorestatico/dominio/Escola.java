package com.github.lucascavalcante.javacore.Fmodificadorestatico.dominio;

public class Escola {
    private String nome;
    private Professor [] professor;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(this.professor == null){
            return;
        }
        for(Professor prof : this.professor){
            System.out.println(prof.getNome());
        }
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessor() {
        return professor;
    }

    public void setProfessor(Professor[] professor) {
        this.professor = professor;
    }
}
