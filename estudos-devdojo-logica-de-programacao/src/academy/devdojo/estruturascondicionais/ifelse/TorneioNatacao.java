package academy.devdojo.estruturascondicionais.ifelse;/*Eu como usuário gostaria de ter o nome e a idade de participantes de um torneio de natação e que o sistema imprimisse
da seguinte forma
Menor que 10 anos: <Nome> participará da categoria Infantil
Entre 11 e 15 anos: <Nome> participará da categoria Juvenil
Entre 16 e 19 anos: <Nome> participará da categoria Pré adulto
A partir de 20 anos: <Nome> participará da categoria Adulto
 */

import java.util.Scanner;

public class TorneioNatacao {
    public static void main(String[] args) {
        Scanner torneio = new Scanner(System.in);
        System.out.println("Informe o nome do participante");
        String nome = torneio.next();
        System.out.println("Informe a idade do participante");
        int idade = torneio.nextInt();
        if (idade<=10){
            System.out.println("O participante " + nome + " tem " + idade + " anos, portanto participará da categoria Infantil");
        }else if(idade >=11 && idade <= 15){
            System.out.println("O participante " + nome + " tem " + idade + " anos, portanto participará da categoria Juvenil");
        }else if(idade >= 16 && idade <=19){
            System.out.println("O participante " + nome + " tem " + idade + " anos, portanto participará da categoria Pré adulto");
        }else{
            System.out.println("O participante " + nome + " tem " + idade + " anos, portanto participará da categoria Adulto");
        }

    }
}
