package com.pombimsjb.dio.desafiosAlgoritimoBasicos.dragao;
e
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int casos, poderDeLuta;

        casos = leitor.nextInt();

        for (int i = 0; i < casos; i++) {
            poderDeLuta = leitor.nextInt();
            if (poderDeLuta > 8000)
                System.out.println("Mais de 8000!");
            else
                System.out.println("Inseto!");
        }
    }

}
