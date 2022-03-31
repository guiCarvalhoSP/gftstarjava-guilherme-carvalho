package com.gft.ex01;

public class Exercicio01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("João", "10/02/2000", 1.75f);

        pessoa.imprimirDados();
        pessoa.calcularIdade();
    }
}
