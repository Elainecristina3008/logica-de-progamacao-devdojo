package academy.devdojo.estruturascondicionais.lacosderepeticao.fors;

public class NovaTabuada {
    public static void main(String[] args) {
        for (int i = 11; i <=20 ; i++) {
            System.out.println("tabuada de: " + i);
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i + "x" + j + "= " + i*j);
            }

        }
    }
}
