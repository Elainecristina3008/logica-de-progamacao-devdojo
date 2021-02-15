/*Apresentar ao usuário uma tela solicitando um login e depois uma senha,
o usuário e senha corretos devem estar armazenados em constantes no seu programa. Se o
usuário acertar o login e senha exibir a mensagem ACESSO CONSEDIDO, caso contrário
exibir a mensagem de ACESSO NEGADO e voltar a pedir o login e senha, essa condição
deve se repetir até que o usuário acerte a combinação.
 */
package academy.devdojo.estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04Login {
    public static void main(String[] args) {
        final String login = "Luffy";
        final String password = "ReiDosPiratas";
        boolean exibirTelaLogin = true;
        Scanner scanner = new Scanner(System.in);
        while (exibirTelaLogin){
            System.out.println("Digite seu login");
            String loginDigitado = scanner.nextLine();
            System.out.println("Digite sua senha");
            String senhaDigitada = scanner.nextLine();
            if (login.equals(loginDigitado) && password.equals(senhaDigitada)){
                System.out.println("Login efetuado com sucesso!!");
                exibirTelaLogin = false;
                break;
            }else{
                System.out.println("Login ou senha digitada incorretos");
            }

        }
    }

}
