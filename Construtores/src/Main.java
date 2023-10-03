import entities.Estoque;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String nome = input.nextLine();

        System.out.print("Agora informe o seu preço: R$");
        double preco = input.nextDouble();

        System.out.print("E a quantidade: ");
        int quantidade = input.nextInt();

        //Construtor criado para armazena los a memória e instancia-los.
        Estoque estoque = new Estoque(nome, preco, quantidade);

        System.out.println("Informações do produto: " + estoque);

        System.out.printf("Agora informe quantos(as) %s deseja adicionar? ", estoque.Nome);
        int quantity = input.nextInt();
        estoque.adicionarProduto(quantity);

        System.out.println("Informações atualizadas: " + estoque);

        System.out.printf("E quantos(as) %s deseja remover? ", estoque.Nome);
        quantity = input.nextInt();
        estoque.removerProduto(quantity);

        System.out.println("Noma atualização: " + estoque);

        input.close();
    }
}