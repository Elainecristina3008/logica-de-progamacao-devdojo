package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class AulaArraysComFor {
    public static void main(String[] args) {
        double[] notas = new double[4];
        System.out.println("Tamanho do Array " + notas.length);
        System.out.println("-------------------------------------");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota " + (i + 1));
            notas[i] = scan.nextDouble();
        }
        double soma = 0;
        double media = 0;
        for (int i = 0; i < notas.length; i++){
            soma = soma + notas[i];
            media = soma/notas.length;
            System.out.println("Nota " + (i+1) + ": " + (notas[i]));
            System.out.println(media);
        }
    }
}
