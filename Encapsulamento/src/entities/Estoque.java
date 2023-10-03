package entities;

public class Estoque {
    private String nome;
    private double preco;
    private int quantidade; //A quantidade só pode ser alterada quando possuir entrada de dados no MAIN.

    public Estoque() {
    }

    public Estoque(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Estoque(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Para chamar.
    public String getNome() {
        return nome;
    }

    //Para alterar.
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Chamando o preço.
    public double getPreco() {
        return preco;
    }

    //Alterando o preço.
    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Somente para chamar a quantidade.
    public int getQuantidade() {
        return quantidade;
    }

    /*
     * Não criar o método setQuantidade(){} para proteger
     * o objeto produto de alterações inconsistentes na
     * quantidade do produto. Só pode mudar por meio das
     * operações entrada e saída do estoque.
     */

    //Preço total de todos os produtos no estoque.
    public double valorTotalEmEstoque() {
        return preco * quantidade;
    }

    //Adicionando um produto.
    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    //Removendo um produto.
    public void removerProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    //Sobre escrevendo tudo para a saida de dados.
    @Override
    public String toString() {
        return nome
                + ", R$"
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidades, Total: R$"
                + String.format("%.2f", valorTotalEmEstoque());
    }
}
