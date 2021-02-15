package academy.devdojo.estruturascondicionais.lacosderepeticao.fors;

public class Aula2ExercicioDesafio {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Tabuada do numero " + i);
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i + "x" + j + "= " + i*j);

            }

        }
    }
}
