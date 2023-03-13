package br.com.exercicios.loops;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos números deseja inserir: ");
        int quantidadeDeNumeros = scan.nextInt();

        int quantPar = 0, quantImpar = 0;

        int contador = 0;

        do{
            System.out.println("Número: ");
            int numero = scan.nextInt();

            if (numero%2 == 0) quantPar++;

            else quantImpar++;

            contador++;
        } while(contador < quantidadeDeNumeros);

        System.out.println("Quantidade de números pares: " + quantPar + " / Quantidade de Números ímpares: " + quantImpar);
    }
}
