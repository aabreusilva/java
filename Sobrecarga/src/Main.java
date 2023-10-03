import entities.Estoque;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        /*
        * Criar um construtor opcional, o qual recebe apenas nome e
        * preço do produto. A quantidade em estoque deste novo produto,
        * por padrão, deverá então ser iniciada com o valor ZERO.
        * - Nota: é possível também incluir um construtor padrão.
        */

        System.out.print("Informe o nome do produto: ");
        String nome = input.nextLine();

        System.out.print("Agora o seu preço: R$");
        double preco = input.nextDouble();



        Estoque estoque = new Estoque(nome, preco);

        System.out.printf("Informações do produto: %s%n", estoque);

        System.out.print("Agora, informe a quantidade que deseja adicionar: ");
        int adicionar = input.nextInt();
        estoque.adicionarProduto(adicionar);

        System.out.printf("Informações atualizadas %s%n", estoque);

        System.out.print("E agora, a quantidade que deseja remover: ");
        int remover = input.nextInt();
        estoque.removerProduto(remover);

        System.out.printf("Informações atualizadas %s%n", estoque);

        input.close();
    }
}