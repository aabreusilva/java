package util;

public class Dolar {
    public static double cotacao(double dolar, double real) {
        double resultado = dolar * real;
        return resultado += resultado * 0.06;
    }
}
