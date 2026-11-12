package com.github.lucascavalcante.javacore.Hheranca.Test;

import com.github.lucascavalcante.javacore.Hheranca.Dominio.Endereco;
import com.github.lucascavalcante.javacore.Hheranca.Dominio.Funcionario;
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

        //pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome(pessoa.getNome());
        funcionario.setSalario(20000);
        funcionario.setEndereco(endereco);
        funcionario.setCpf(pessoa.getCpf());

        funcionario.imprime();
    }
}
