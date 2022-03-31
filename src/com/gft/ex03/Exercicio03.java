package com.gft.ex03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        float precoLimao = 2, precoTamarindo = 4;
        int descontoLimao = 3, descontoTamarindo2litros = 4, descontoTamarindo5litros = 6;

        String sucoEscolhido;
        float qtdLitrosPedido;
        Scanner scan = new Scanner(System.in);
        VendinhaSucos vendinha = new VendinhaSucos(precoLimao, precoTamarindo, descontoLimao, descontoTamarindo2litros, descontoTamarindo5litros);

        System.out.println("Vendinha de sucos: Digite L para limão, ou T para tamarindo");
        System.out.println("Preços: Limão R$" + precoLimao + " | Tamarindo R$" + precoTamarindo);

        sucoEscolhido = scan.next();

        System.out.println("Qual a quantidade de suco desejada em litros? ");
        qtdLitrosPedido = scan.nextFloat();

        vendinha.fazerVenda(sucoEscolhido, qtdLitrosPedido);
    }
}
