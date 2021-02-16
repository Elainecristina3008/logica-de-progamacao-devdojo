package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula03AtividadeMelhorada {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        Scanner scan = new Scanner(System.in);
    String resultadoArray = "";
        for (int i = 0; i < array1.length ; i++) {
            System.out.println("Vetor 1, posição: " + i +  ": ");
            array1[i] = scan.nextInt();
            System.out.println("Vetor 2, posição: " + i +  ": ");
            array2[i] = scan.nextInt();
            array3[i] = array1[i]*array2[i];
            resultadoArray = resultadoArray + array3[i] + " ";
        }
        System.out.println(resultadoArray);
    }
}
