import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        /*
        * Fazer um programa para ler um número inteiro N e depois um vetor
        * de N números reais. Em seguida, mostrar na tela a média de todos
        * os elementos com três casas decimais. Depois mostrar todos os
        * elementos do vetor que estejam abaixo da média, com uma casa
        * decimal cada.
        */

        double media = 0.0, menor = 0.0;

        System.out.print("Quantos elementos possui este vetor? ");
        int [] vetor = new int[input.nextInt()];

        double [] valores = new double[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Informe o %d° número: ", i + 1);
            valores[i] = input.nextDouble();
        }

        for (int i = 0; i < vetor.length; i++) {
            media += valores[i] / vetor.length;
        }

        System.out.printf("Média do vetor: %.3f\n", media);

        media = vetor[0];

        System.out.println("Elementos abaixo da média: ");

        for (int j : vetor) {
            if (j < media) {
                System.out.printf("%.1f\n", (double) j);
            }
        }

        input.close();
    }
}