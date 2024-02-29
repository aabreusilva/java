import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        * Fazer um programa para ler um vetor de N números inteiros. Em seguida,
        * mostrar na tela a média aritmética somente dos números pares lidos,
        * com uma casa decimal. Se nenhum número par for digitado, mostrar a
        * mensagem "Nenhum número par".
        */

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int media = 0, pares = 0;

        System.out.print("Informe quantos elementos possuem este vetor: ");
        int [] vetor = new int[input.nextInt()];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Informe o %d° número: ", i + 1);
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                media += vetor[i];
                pares++;
            }
        }

        if (pares == 0) {
            System.out.print("Nenhum número é par!");
        }
        else {
            media = media / pares;
            System.out.printf("Média dos pares: %.1f\n", (double) media);
        }

        input.close();
    }
}