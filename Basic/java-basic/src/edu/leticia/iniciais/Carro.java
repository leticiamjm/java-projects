package edu.leticia.iniciais;
public class Carro {

    // atributos dentro da classe para criar múltiplos objetos

    String modelo;
    String cor;
    int ano;

    public static void main(String[] args) {
        
        Carro carro1 = new Carro();
        carro1.modelo = "Ferrari";
        carro1.cor = "Verde";
        carro1.ano = 2023;

        Carro carro2 = new Carro();
        carro2.modelo = "Fiat";
        carro2.cor = "Azul";
        carro2.ano = 2015;

        Carro carro3 = new Carro();
        carro3.modelo = "Renault";
        carro3.cor = "Branco";
        carro3.ano = 2025;

        System.out.println("Primeiro carro: " + carro1.modelo + ",  " + carro1.cor + ",  " + carro1.ano);
        System.out.println("Segundo carro: " + carro2.modelo + ",  " + carro2.cor + ",  " + carro2.ano);
        System.out.println("Terceiro carro: " + carro3.modelo + ",  " + carro3.cor + ",  " + carro3.ano);
    }

}
