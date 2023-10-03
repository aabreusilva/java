package entities;

public class Estoque {

    public String Nome;
    public double Preco;
    public int Quantidade;

    public Estoque(String nome, double preco, int quantidade) { //Construtor criado e referenciado aos atributos utilizando o this.
        this.Nome = nome;
        this.Preco = preco;
        this.Quantidade = quantidade;
    }

    public double valorTotalEmEstoque() {
        return Preco * Quantidade;
    }

    public void adicionarProduto(int quantidade) {
        this.Quantidade += quantidade;
    }

    public void removerProduto(int quantidade) {
        this.Quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return Nome
                + ", R$"
                + String.format("%.2f", Preco)
                + ", "
                + Quantidade
                + " unidades, Total: R$"
                + String.format("%.2f", valorTotalEmEstoque());
    }
}
