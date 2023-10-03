package entities;

import java.util.Date;

public class Pedido {
    private Date data;
    private Estoque estoque;

    public Pedido(Date data, Estoque estoque) {
        super();
        this.data = data;
        this.estoque = estoque;
        //Precisando fazer uma alteração no nome.
        //Quando é private, só modifico pela classe
        //Mas caso é protected posso modifica-lo caso seja do mesmo pacote e subclasses.(entities.Estoque).
        this.estoque.nome = "Alexandre";
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }
}
