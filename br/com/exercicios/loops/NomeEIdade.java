package br.com.exercicios.loops;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String nome;
        String sobrenome;
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome = scan.next();

            if (nome.equals("0")){
                break;
            }

            System.out.println("Sobrenome: ");
            sobrenome = scan.next();

            if (sobrenome.equals("0")){
                break;
            }

            System.out.println("Idade: ");
            idade = scan.nextInt();

            System.out.println("Nome: " + nome + " " + sobrenome + " - idade: " + idade + " Anos");

        }
    }
}
