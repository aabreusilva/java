import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        /*
        * Fazer um programa para ler um conjunto de nomes de pessoas e suas
        * respectivas idades. Os nomes devem ser armazenados em um vetor, e as
        * idades em outro vetor. Depois, mostrar na tela o nome da pessoa
        * mais velha.
        */

        System.out.print("Informe a quantidade de pessoas deseja armazenar no vetor: ");
        int [] pessoas = new int[input.nextInt()];

        String [] nomes = new String[pessoas.length];
        int [] idades = new int[pessoas.length];

        for (int i = 0; i < pessoas.length; i++) {

            System.out.printf("Nome da %d° pessoa: ", i + 1);
            nomes[i] = input.next();

            System.out.print("Idade: ");
            idades[i] = input.nextInt();
        }

        int idade = idades[0], posicao = 0;

        for (int i = 0; i < pessoas.length; i++) {

            if (idades[i] > idade) {
                idade = idades[i];
                posicao = i;
            }

        }

        System.out.printf("Pessoa mais velha: %s", nomes[posicao]);

        input.close();
    }
}