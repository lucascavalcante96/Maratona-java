package com.github.lucascavalcante.javacore.Fmodificadorestatico.test;

import com.github.lucascavalcante.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(180);

        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 295);
        Carro carro3 = new Carro("Audi", 290);


        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
