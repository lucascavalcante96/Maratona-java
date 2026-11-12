package com.github.lucascavalcante.javacore.Hheranca.Test;

import com.github.lucascavalcante.javacore.Hheranca.Dominio.Endereco;
import com.github.lucascavalcante.javacore.Hheranca.Dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("55200-000");
        endereco.setRua("Rua Abc");
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("123321213-13");
        pessoa.setEndereco(endereco);
        pessoa.setNome("Josef dos Santos Silva");

        pessoa.imprime();

    }
}
