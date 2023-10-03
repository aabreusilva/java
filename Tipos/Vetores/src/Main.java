import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas desejam informar sua altura? ");
        int numero = input.nextInt();

        double[] vetor = new double[numero];

        for (int i = 0; i < numero; i++) {

            System.out.printf("Informe a %.0fa altura: ", (double) i + 1);
            vetor[i] = input.nextDouble();

        }

        double media = 0.0;

        for (int i = 0; i < numero; i++) {
            media += vetor[i] / numero;
        }

        System.out.printf("Média das alturas: %.2f", media);

        input.close();
    }
}