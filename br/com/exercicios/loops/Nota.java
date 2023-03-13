package br.com.exercicios.loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Nota de o a 10: ");
        int nota = scan.nextInt();

        while(nota < 0 | nota > 10) {
            System.out.println("Nota Inválida!");
            System.out.println("Tente novamente. Nota: ");
            nota = scan.nextInt();
        }

        System.out.println("Nota: " + nota);
    }
}
