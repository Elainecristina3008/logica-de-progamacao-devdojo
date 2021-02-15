package academy.devdojo.variaveis;

public class ReutiizandoVariaveis{
    public static void main(String[] args) {
        double salario = 2200.00;
        double salLiquido = salario - (salario * 0.3);
        System.out.println("O valor liquido é R$" + salLiquido);
        salLiquido = salario - (salario * 0.15);
        System.out.println("O valor liquido é R$" + salLiquido);
        salLiquido = salario - (salario * 0.05);
        System.out.println("O valor liquido é R$" + salLiquido);
    }
}
