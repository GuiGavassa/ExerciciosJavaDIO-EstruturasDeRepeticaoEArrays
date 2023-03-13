package br.com.exercicios.arrays;

public class OrdemInversa {
    public static void main(String[] args){

        int[] vetor = {-3, -6, 8, 10, 50, 3};

        int contador = 0;
        System.out.print("Vetor com While");
        while (contador < (vetor.length)){
            System.out.print(vetor[contador] + " ");
            contador++;
        }

        System.out.print("\nVetor INVERSO com FOR: ");
        for (int i = (vetor.length -1 ); i >= 0 ; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
