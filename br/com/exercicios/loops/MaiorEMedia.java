package br.com.exercicios.loops;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double maior = 0;
        double soma = 0;
        double media;
        int contador = 0;

        do {
            System.out.println("Número: ");
            double numero = scan.nextDouble();

            if (numero > maior){
                maior = numero;
            }
            soma = soma + numero;

            contador = contador + 1;

        } while (contador < 5);

        media = soma / 5;

        System.out.println("Maior: "+ maior + " Média" + media);
    }
}
