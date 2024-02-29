import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Ler dois números inteiros M e N, e depois ler
         * uma matriz de M linhas por N colunas contendo
         * números inteiros, podendo haver repetições. Em
         * seguida, ler um número inteiro X que pertence à
         * matriz. Para cada ocorrência de X, mostrar os
         * valores à esquerda, acima, à direita e abaixo
         * de X, quando houver, conforme exemplo.
         */
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número de linhas da matriz: ");
        int linhas = input.nextInt();

        System.out.print("Agora o número de colunas: ");
        int colunas = input.nextInt();

        //Criando a matriz.
        int[][] matriz = new int[linhas][colunas];

        //Percorrendo a matriz.
        for (int i = 0; i < linhas; i++) {

            for (int j = 0; j < colunas; j++) {

                System.out.printf("Informe os dados para acrescentar a matriz de linha %d coluna %d: ", linhas, colunas);
                matriz[i][j] = input.nextInt();

            }
        }

        System.out.println("Agora informe um número para informação de ocorrência: ");
        int ocorrencia = input.nextInt();

        for (int i = 0; i < linhas; i++) {

            for (int j = 0; j < colunas; j++) {

                if (matriz[i][j] == ocorrencia) {

                    System.out.println("Posição: " + i + ", " + j + ": ");

                    if (j > 0) {

                        System.out.println("Esquerda: " + matriz[i][j - 1]);

                    }

                    if (i > 0) {

                        System.out.println("Cima: " + matriz[i - 1][j]);

                    }

                    if (j < matriz[i].length - 1) {

                        System.out.println("Direita: " + matriz[i][j + 1]);

                    }

                    if (i < matriz.length - 1) {

                        System.out.println("Abaixo: " + matriz[i + 1][j]);

                    }
                }
            }
        }


        input.close();
    }
}