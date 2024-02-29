import entities.Empregado;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Fazer um programa para ler um número inteiro N e depois od dados (id, nome, e salario) de
         * N funcionários. Não deve haver repetições de id.
         * Em seguida, efetuar o aumento de X por centro no salário de um determinado funcionário.
         * Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
         * mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários.
         *
         * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser
         * mudado livremente. Um salário só pode ser aumentado com base em uma operação de aumento por
         * porcentagem dada.*/
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Empregado> lista = new ArrayList<>();

        System.out.print("Informe quantos empregados serão registrados: ");
        int numero = input.nextInt();

        for (int i = 0; i < numero; i++) {

            System.out.printf("Empregado #%d\n", i + 1);

            System.out.print("N° de identificação: ");
            int identificacao = input.nextInt();

            System.out.print("Nome: ");
            input.nextLine();
            String nome = input.nextLine();

            System.out.print("Salário: R$");
            double salario = input.nextDouble();

            lista.add(new Empregado(identificacao, nome, salario));

            System.out.println();

        }

        //Parte 2: Buscando o empregado pelo id e adicionando o salário.
        System.out.print("Agora, informe o número do funcionário que deseja aumentar seu salário: ");
        int identificacao = input.nextInt();

        //Buscando o id do funcionário para aumentar seu salário.
        //*Encontrar primeira ocorrência com base em predicado.
        //Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
        Empregado empregado = lista.stream().filter(x -> x.getId() == identificacao).findFirst().orElse(null);

        //"Se o id informado não existir, mostrar uma mensagem e abortar a operação."
        if (empregado == null) {

            System.out.println("Este número não existe!");

        }
        else {
            //incrementando a porcentagem sobre o salário.
            System.out.print("Informe a porcentagem: ");
            double porcentagem = input.nextDouble();
            empregado.aumentarSalario(porcentagem);

        }

        //Listando todos os empregados:
        System.out.println();

        System.out.println("Lista dos empregados:");

        //Percorre a lista através da variável lista
        for (Empregado apresentar : lista){

            System.out.println(apresentar);

        }

        input.close();

    }
}
