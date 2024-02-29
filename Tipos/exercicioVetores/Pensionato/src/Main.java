import entities.Aluguel;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        /*
        * A dona de um pensionato possui dez quartos para alugar para estudantes,
        * sendo esses quartos identificados pelos números 0 a 9.
        *
        * Fazer um programa que inicie com todos os 10 quartos vazios, e depois
        * leia uma quantidade N representando o número de estudantes que vão
        * alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel
        * dos N estudantes. Para cada registro de aluguel, informar o NOME e
        * EMAIL do estudante, bem como qual os quartos ele escolheu (de 0 a 9).
        * Suponha que seja escolhido um quarto vago. Ao final, seu programa deve
        * imprimir um relatório de todas ocupações do pensionato, por ordem de
        * quarto, conforme exemplo.
        */

        Aluguel [] vetor = new Aluguel[10];

        System.out.print("Quantos quartos deseja alugar? ");
        int [] quartos = new int[input.nextInt()];

        for (int i = 1; i <= quartos.length; i++) {

            System.out.println();

            System.out.printf("Aluguel #%d:%n", i);

            System.out.print("Nome: ");
            input.nextLine();
            String nome = input.nextLine();

            System.out.print("Email: ");
            String email = input.next();

            System.out.print("Quarto: ");
            int numeroQuarto = input.nextInt();

            Aluguel aluguel = new Aluguel(nome, email);

            //Instanciando o objeto e atribuindo a referência dele para o vetor na posição numeroQuarto.
            vetor[numeroQuarto] = new Aluguel(nome, email);
        }

        System.out.println();

        System.out.println("Quartos ocupados:");

        for (int i = 0; i < 10; i++) {

            if (vetor[i] != null) {
                System.out.println(i + ", " + vetor[i]);
            }

        }

        input.close();
    }
}