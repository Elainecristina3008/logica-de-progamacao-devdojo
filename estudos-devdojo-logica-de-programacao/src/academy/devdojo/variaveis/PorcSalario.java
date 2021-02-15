package academy.devdojo.variaveis;

public class PorcSalario {
    public static void main(String[] args) {
        double salario = 6200.23;
        double desconto = (salario*8)/100;
        double totLiquido = salario - desconto;
        System.out.println("Com R$" + desconto + "O total líquido a receber é: R$" + totLiquido);
    }
}
