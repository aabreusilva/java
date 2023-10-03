import util.Dolar;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor do dólar atualmente: ");
        double dolar = input.nextDouble();

        System.out.print("Agora, quanto deseja comprar em dólar: ");
        double real = input.nextDouble();

        double total = Dolar.cotacao(dolar, real);

        System.out.printf("Valor total a pagar em R$%.2f", total);

        input.close();
    }
}