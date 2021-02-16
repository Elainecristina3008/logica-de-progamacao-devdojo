package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula03Atividade {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array1.length ; i++) {
            System.out.println("Vetor 1, posição: " + i +  ": ");
            array1[i] = scan.nextInt();
            System.out.println(array1[i]);
            
        }
        for (int i = 0; i < array2.length ; i++) {
            System.out.println("Vetor 2, posição: " + i +  ": ");
            array2[i] = scan.nextInt();
            System.out.println(array2[i]);

        }
        for (int i = 0; i < array3.length ; i++) {
            System.out.println("Vetor 3, posição: " + i +  ": ");
            array3[i] = scan.nextInt();
            System.out.println(array3[i]);

        }
    }
}
