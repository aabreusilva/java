import entities.Estoque;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Estoque estoque = new Estoque();

        System.out.println(estoque);

        input.close();
    }
}