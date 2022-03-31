package com.gft.ex02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o turno em que trabalha (M - Matutino, V - Vespertino, N - Noturno):");
        String periodo = scan.next();

        switch (periodo){
            case "M":
                System.out.println("Bom dia!");
                break;
            case "V":
                System.out.println("Boa Tarde!");
                break;
            case "N":
                System.out.println("Boa noite !");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
}
