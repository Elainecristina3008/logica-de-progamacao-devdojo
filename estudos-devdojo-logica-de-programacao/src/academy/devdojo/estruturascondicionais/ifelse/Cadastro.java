package academy.devdojo.estruturascondicionais.ifelse;/* Eu, como administrador do sistema, gostaria de permitir que os próprios usuários cadastrassem o nome de
usuário  (login) no sistema para agilizar o processo de migração do sistema antigo para o sistema novo.

O usuário não pode deixar vazio "", ou criar um usuário com o login "admin" ou "Administrador".
Se o Valor entrado for válido, o sistema deverá exibir uma mensagem  <Nome do usuário> cadastrado com sucesso.
Senão o sistema deverá mostrar o erro "Usuário inválido"
 */

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner cadastro = new Scanner(System.in);
        System.out.println("Informe o nome de usuário");
        String login = cadastro.next();
        if(login.equalsIgnoreCase(" ")  || login.equalsIgnoreCase("admin") || login.equalsIgnoreCase("administrador")){
            System.out.println(login + "Usuário inválido");
        }else{
            System.out.println(login + " Usuário cadastrado com sucesso");
        }
    }

}
