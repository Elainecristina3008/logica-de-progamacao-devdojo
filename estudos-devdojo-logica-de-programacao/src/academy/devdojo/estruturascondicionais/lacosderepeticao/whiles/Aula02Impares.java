package academy.devdojo.estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02Impares {
    public static void main(String[] args) {
        Scanner parouimpar = new Scanner(System.in);
        System.out.println("Informe o número desejado");
        int valorFinal = parouimpar.nextInt();
        int i = 0;
        while (i <= valorFinal){
            if(i % 2 !=0 ){
                System.out.println("i = " + i);
            }
            i = i+1;
        }
    }
}
