package academy.devdojo.arrays.unidimensional;

public class Aula02Arrays {
    public static void main(String[] args) {
        double[] notas = new double[4];
        System.out.println("Tamanho do Array " + notas.length);
        System.out.println("-------------------------------------");
        notas[0] = 9.5;
        notas[1] = 10;
        notas[2] = 7.2;
        notas[3] = 6.1;
        for (int i = 0; i < notas.length ; i++) {
            System.out.println(notas[i]);
            
        }
    }
}
