package academy.devdojo.arrays;

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
        for (int i = 0; i < notas.length; i++){
            System.out.println("Nota " + (i+1) + ": " + (notas[i]));
        }
    }
}
