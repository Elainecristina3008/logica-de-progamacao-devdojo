package academy.devdojo.variaveis;

import java.util.Scanner;

public class RecebendoDadosDoteclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu nome");
        String nome = teclado.next();
        System.out.println("Informe a sua idade");
        int idade = teclado.nextInt();
        System.out.println("A idade informada por " + nome + " é: " + idade);
    }
}
