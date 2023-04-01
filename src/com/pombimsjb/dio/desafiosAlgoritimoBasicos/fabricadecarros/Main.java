package com.pombimsjb.dio.desafiosAlgoritimoBasicos.fabricadecarros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de custo de fábrica:");
        int custoFabrica = scan.nextInt();

        System.out.println("Digite a porcentagem do distribuidor:");
        int porcentagemDistribuidor = scan.nextInt();

        System.out.println("Digite o valor dos impostos:");
        int PercentualImpostos = scan.nextInt();


        int custoConsumidor;
        int Distribuidor;
        int ValorImpostos;

        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:

        Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        ValorImpostos = (custoFabrica*PercentualImpostos)/100;



        System.out.println(custoFabrica+Distribuidor+ValorImpostos);
    }
}
