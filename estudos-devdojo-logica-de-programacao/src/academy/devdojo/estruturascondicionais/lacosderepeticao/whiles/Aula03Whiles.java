package academy.devdojo.estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula03Whiles {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner opcoes = new Scanner(System.in);
        while (opcao !=3){
            System.out.println("Digite 1 para Calcular imposto");
            System.out.println("Digite 2 para Depositar Salário");
            System.out.println("Digite 3 Sair");
            System.out.println("Digite a sua opção");
            opcao = opcoes.nextInt();

        }
        System.out.println("Atendimento encerrado");

    }
}
