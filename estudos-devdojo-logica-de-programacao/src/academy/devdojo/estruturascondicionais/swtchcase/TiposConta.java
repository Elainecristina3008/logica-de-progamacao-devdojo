/* Como gerente, eu gostaria que meus usuários pudessem
digitar o tipo de conta e o sistema imprima qual a porcentagem de juros
que aquela conta irá oferecer para o cliente para agilizar o acesso as informações
Os tipos das contas são
CONTA_POUPANÇA 0,05%;
CONTA_CORRENTE 0,02%;
CONTA_INVESTIMENTO 0,1%;
 */
package academy.devdojo.estruturascondicionais.swtchcase;

import java.util.Scanner;

public class TiposConta {
    public static void main(String[] args) {
        Scanner tipo = new Scanner(System.in);
        System.out.println("Informe seu tipo de conta");
        String conta = tipo.next();
        switch (conta){
            default:
                System.out.println("Tipo de conta inválido");
                break;
            case "CONTA_POUPANCA":
                System.out.println(conta + ". Sua porcentagem de rendimento é de 0,05%");
                break;
            case "CONTA_CORRENTE":
                System.out.println(conta + ". Sua porcentagem de rendimento é de 0,02%");
                break;
            case "CONTA_INVESTIMENTO":
                System.out.println(conta + ". Sua porcenagem de rendimento é de 0,1%");
        }
    }
}
