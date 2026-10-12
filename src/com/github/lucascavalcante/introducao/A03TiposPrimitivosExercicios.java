package com.github.lucascavalcante.introducao;

public class A03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Lucas";
        String endereco = "Rua das orquideas";
        double salario = 2500.0;
        String data = "12/10/2026";

        System.out.printf("Eu %s, morando no endereço %s,\nconfirmo que recebi o salário" +
                "de %.2f, na data %s", nome, endereco, salario, data);
    }
}
