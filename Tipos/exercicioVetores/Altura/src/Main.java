import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo.
        * Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem
        * de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.
        */

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double alturaMedia = 0.0, porcentagem;
        int nMenores = 0;

        System.out.print("Existem quantas pessoas? ");
        int [] pessoas = new int[input.nextInt()];

        String [] nomes = new String[pessoas.length];
        int [] idades = new int[pessoas.length];
        double [] alturas = new double[pessoas.length];

        for (int i = 0; i < pessoas.length; i++) {

            System.out.println();

            System.out.printf("Dados da %d° pessoa:\n", i + 1);

            System.out.print("Nome: ");
            nomes[i] = input.next();

            System.out.print("Idade: ");
            idades[i] = input.nextInt();

            System.out.print("Altura: ");
            alturas[i] = input.nextDouble();
        }

        //Altura média.
        for (int i = 0; i < pessoas.length; i++) {
            alturaMedia += alturas[i] / pessoas.length;
        }

        //Nome de pessoas de menores que 16 anos.
        for (int i = 0; i < pessoas.length; i++) {
            if (idades[i] < 16) {
                nMenores++; //Contar quantas pessoas possuem abaixo dos 16.
            }
        }

        porcentagem = nMenores * 100.00 / pessoas.length; //pessoas.length = 100%  nMenores = 2 de pessoas.length [5 - 100 | 2 - x -> 5x = 200 -> x = 200 / 5 = 40.0%

        System.out.println();

        System.out.printf("Altura média: %.2f%n", alturaMedia);
        System.out.printf("Porcentagem de pessoas abaixo dos 16 anos: %.1f%%%n", porcentagem);

        for (int i = 0; i < pessoas.length; i++) { //Buscando no vetor os nomes com idades abaixo dos 16 anos.
            if (idades[i] < 16) {

                System.out.printf("%s%n", nomes[i]);

            }
        }

        input.close();
    }
}