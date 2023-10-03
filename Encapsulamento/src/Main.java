import entities.Estoque;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        * Encapsulamento é um princípio que consiste em esconder
        * detalhes de implementação de uma classe, expondo apenas
        * operações seguras e que mantenham os objetos em um estado
        * consistente.
        *
        * Regra de ouro: o objetivo deve sempre estar em um estado
        * consistente, e a própria classe deve garantir isso.
        * Analogia: APARELHO DE SOM.
        *
        * Regra geral básica: Um objeto NÃO deve expor nenhum
        * atributo (modificador de acesso PRIVATE).
        *
        * Os atributos devem ser acessados por meio de métodos
        * get e set.
        */
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String nome = input.nextLine();

        System.out.print("Agora informe o seu preço: R$");
        double preco = input.nextDouble();

        //System.out.print("Agora a quantidade: ");
        //int quantidade = input.nextInt();

        Estoque estoque = new Estoque(nome, preco);

        //Caso queira alterar o atributo private preciso criar um método setNome() para altera-lo.
        estoque.setNome("Computador");

        //Atribuindo um preço novo ao produto.
        estoque.setPreco(1200.00);

        //Atualizando o nome do produto.
        System.out.printf("Nome do produto atualizado: %s%n", estoque.getNome());

        //Atualizando o preço do produto.
        System.out.printf("Preço do produto atualizado: %.2f", estoque.getPreco());

        //Saída já atualizada.
        System.out.println("Informações do produto: " + estoque);

        //Adicionando mais produtos ao estoque.
        System.out.printf("Agora informe quantos(as) %s deseja adicionar? ", estoque.getNome());
        int adicionar = input.nextInt();
        estoque.adicionarProduto(adicionar);

        System.out.println("Informações atualizadas: " + estoque);

        //Agora removendo produtos do estoque.
        System.out.printf("E quantos(as) %s deseja remover? ", estoque.getNome());
        int remover = input.nextInt();
        estoque.removerProduto(remover);

        System.out.println("Noma atualização: " + estoque);

        input.close();
    }
}