import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        /*Ler um número inteiro N e uma matriz de ordem N contendo
         * números inteiros. Em seguida, mostrar a diagonal principal
         * e a quantidade de valores negativos da matriz.
         */

        //Matriz 3x3.
        System.out.print("Informe o formato da matriz (?x?): ");
        int numero = input.nextInt();

        //Criando a matriz bidimensional com números inteiros.
        int[][] matriz = new int[numero][numero];

        for (int i = 0; i < numero; i++) { //Linha.

            for (int j = 0; j < numero; j++) { //Coluna.
                System.out.printf("Informe o valor para acrescentar na matriz de linha %d coluna %d: ", i, j);
                matriz[i][j] = input.nextInt();
                System.out.println();
            }
        }

        System.out.print("Diagonal principal: ");

        //Imprimindo números da diagonal principal. [0, 0] [1, 1] [2, 2] (1, 5, 9)
        for (int i = 0; i < numero; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();

        int count = 0;

        //Contagem de números negativos dentro da matriz.
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                if (matriz [i][j] < 0) {
                    count++;
                }
            }
        }

        System.out.print("Quantidade de números negativos: " + count);


        input.close();
    }
}