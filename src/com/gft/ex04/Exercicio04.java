package com.gft.ex04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Doação de sangue! Digite sua idade para saber se você pode doar:");
        int idade = scan.nextInt();

        if(idade >= 18 && idade <= 67)
            System.out.println("Você pode doar sangue!");
        else
            System.out.println("Voce não pode doar sangue!");
    }

}
