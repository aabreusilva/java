import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        /*
        * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas
        * que eles foram avaliados no 1° e 2° semestres. Cada uma dessas informações deve
        * ser armazenadas em um vetor. Depois, imprimir os nomes dos alunos aprovados,
        * considerando aprovados aqueles cuja a média das notas sej maior ou igual a 6.
        */

        double soma;

        System.out.print("Qual a quantidade de alunos? ");
        int [] alunos = new int[input.nextInt()];

        String [] nomes = new String[alunos.length];
        double [] primeiro = new double[alunos.length];
        double [] segundo = new double[alunos.length];


        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("Informe o nome, primeira e segunda nota do %d° aluno: %n", i + 1);
            input.nextLine();

            nomes[i] = input.nextLine();
            primeiro[i] = input.nextDouble();
            segundo[i] = input.nextDouble();
        }

        System.out.println("Alunos aprovados: ");

        for (int i = 0; i < alunos.length; i++) {

            soma = (primeiro[i] + segundo[i]) / 2.0;

            if (soma >= 6.0) {
                System.out.printf("%s. %n", nomes[i]);
            }
        }
        input.close();
    }
}