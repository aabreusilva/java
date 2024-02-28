import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         * Fazer um programa que leia N números reais e armazene-os em um vetor.
         * Em seguida, mostrar na tela o maior número do vetor (supor não haver
         * empates). Mostrar também a posição do maior elemento, considerando a
         * primeira posição como 0.
         */
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int maior = 0, posMaior = 0;

        System.out.print("Informe quantos números deseja digitar: ");
        int[] vetor = new int[input.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Informe o %d° número: ", i + 1);
            vetor[i] = (int) input.nextDouble();
        }

        maior = vetor[0]; //Contando com negativos.

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i;
            }
        }

        System.out.printf("Maior valor: %.1f", (double) maior);
        System.out.printf("Posição do vetor onde está o  maior número: %d", posMaior);

        input.close();
    }
}