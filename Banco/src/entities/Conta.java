package entities;

public class Conta {

    private int numero;
    private String nome;
    private double saldo;

    public Conta() {
    }

    public Conta(int numero, String nome) {
        this.nome = nome;
        this.numero = numero;
    }

    public Conta(int numero, String nome, double depositoInicial) {
        this.nome = nome;
        this.numero = numero;
        depositar(depositoInicial);
    }

    //Buscando o número da conta pois ele será um valor imutável.
    public int getNumero() {

        return numero;
    }

    //Da mesma forma que o número da conta: será um valor que não pode mudar.
    public double getSaldo() {
        return saldo;
    }

    //Já o nome, como solicitado  o exercício pode ser alterado.
    public String getNome() {

        return nome;
    }

    //Para alterar o nome.
    public String setNome(String nome) {

        return this.nome = nome;
    }

    //Método para somar o saldo com o valor que deseja depositar.
    public void depositar(double saldo) {
        this.saldo += saldo;
    }

    //Caso deseja subtrair um valor desejado ao saldo.
    public void sacar(double saldo) {

        this.saldo -= saldo + 5.0;
    }

    @Override
    public String toString() {
        return "Conta: "
                + numero
                + ", Titular: "
                + nome
                + ", Saldo: R$"
                + String.format("%.2f", saldo);
    }
}
