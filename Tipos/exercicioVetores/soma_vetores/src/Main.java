import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        /*
        * Faça um programa para ler dois vetores A e B, contendo N elementos cada.
        * Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
        * elementos correspondentes de A e B. Imprima o vetor C gerado.
        */

        System.out.print("Informe a quantidade de valores terá cada vetor: ");
        int [] vetor = new int[input.nextInt()];

        int [] a = new int [vetor.length];
        int [] b = new int [vetor.length];
        int [] c = new int [vetor.length];

        System.out.println();

        //Valores do vetor A.
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Informe o %d° número do vetor A: ", i + 1);
            a[i] = input.nextInt();
        }

        System.out.println();

        //valores do vetor B
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Informe o %d° número do vetor B: ", i + 1);
            b[i] = input.nextInt();
        }

        System.out.println();

        //Soma dos valores de cada vetor.
        for (int i = 0; i < vetor.length; i++) {
            c[i] = a[i] + b[i];
        }

        System.out.println("Soma dos vetores: ");

        //Apresentando o resultante da soma dos vetores.
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d%n", c[i]);
        }

        input.close();
    }
}