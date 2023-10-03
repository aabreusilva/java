import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe quantos produtos desejar estocar: ");
        Produto [] vetor = new Produto[input.nextInt()];

        for (int i = 0; i < vetor.length; i++) {

            input.nextLine();

            System.out.printf("Informe o nome do %d° produto: ", i + 1);
            String nome = input.nextLine();

            System.out.printf("Agora o preço do %d° produto: ", i + 1);
            double preco = input.nextDouble();

            System.out.println();

            vetor[i] = new Produto(nome, preco);
        }

        double media = 0.0;

        for (Produto produto : vetor) {
            media += produto.getPreco() / vetor.length;
        }

        System.out.printf("Média dos preços: R$%.2f", media);

        System.out.println();

        input.close();
    }
}