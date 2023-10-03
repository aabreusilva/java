import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Conta conta;

        System.out.print("Informe o número da conta: ");
        int numero = input.nextInt();

        System.out.print("Agora informe o nome do(a) títular: ");
        input.nextLine();
        String nome = input.nextLine();

        System.out.print("É o seu primeiro depósito (S/N)? ");
        char resposta = input.next().charAt(0);

        System.out.println();

        if (resposta == 'S' || resposta == 'Y' || resposta == 's' || resposta == 'y') {
            System.out.print("Informe o valor inicial para depósito: R$");
            double depositoInicial = input.nextDouble();

            conta = new Conta(numero, nome, depositoInicial);
        }
        else {

            conta = new Conta(numero, nome);

        }

        System.out.println();
        System.out.printf("Informações atualizadas: %s%n", conta);
        System.out.println();

        System.out.print("Deseja fazer um novo depósito (S/N)?");
        resposta = input.next().charAt(0);

        System.out.println();

        if (resposta == 'S' || resposta == 'Y' || resposta == 's' || resposta == 'y') {

            System.out.print("Informe o valor para depositar: R$");
            double depositarConta = input.nextDouble();
            conta.depositar(depositarConta);

            conta = new Conta(numero, nome, conta.getSaldo());
        }
        else {

            conta = new Conta(numero, nome);

        }

        System.out.println();
        System.out.printf("Informações atualizadas:%s%n", conta);
        System.out.println();

        System.out.print("Deseja sacar um valor (S/N)? Taxa: R$5.00");
        resposta = input.next().charAt(0);

        System.out.println();

        if (resposta == 'S' || resposta == 'Y' || resposta == 's' || resposta == 'y') {

            System.out.print("Informe quanto deseja sacar: R$");
            double sacarConta = input.nextDouble();
            conta.sacar(sacarConta);

            conta = new Conta(numero, nome, conta.getSaldo());

        }
        else {

            conta = new Conta(numero, nome);

        }

        System.out.println();
        System.out.printf("Informações atualizadas: %s%n", conta);

        input.close();
    }
}