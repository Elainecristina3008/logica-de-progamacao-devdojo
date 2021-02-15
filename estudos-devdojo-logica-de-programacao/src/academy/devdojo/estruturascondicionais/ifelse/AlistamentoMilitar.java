package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

/* Como secretário de alistamento militar eu gostaria que meu sistema aceitasse os seguintes parâmetros
para que eu possa agilizar o processo de cadastramento:
sexo, sendo válido apenas M ou F e idade.
Se o sexo for Masculino e a idade for maior ou igual a 18 o sistema deve imprimir o alistamento obrigatório
Se o sexo for Masculino e a idade for menor que 18 anos o sistema deve imprimir, alistamento não permitido
Se o sexo for Feminino e a idade for maior ou igual a 18 anos o sistema deve perguntar se a pessoa deseja se alistar
Se o sexo for Feminino e a idade for menor que 18 anos o sistema deve imprimir, alistamento não permitido.
 */
public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner alistar = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = alistar.next();
        System.out.println("Informe seu gênero (V ou F): ");
        String genero = alistar.next();
        System.out.println("Informe sua idade");
        int idade = alistar.nextInt();
        if(genero.equals("F") && idade <18){
            System.out.println(nome + ", desculpe, alistamento não permitido");
        }else if(genero.equals("F") && idade >= 18){
            System.out.println(nome + ", alistamento permitido, deseja se alistar?");
        }else if(genero.equals("M") && idade >= 18){
            System.out.println(nome + ", alistamento permitido");
        }else if(genero.equals("M") && idade < 18){
            System.out.println(nome + ", desculpe, alistamento não permitido");
        }

    }
}
