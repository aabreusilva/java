public class Main {
    public static void main(String[] args) {

        int x = 20;

        //Boxing.
        //Object objeto = x;

        //Wrapper.
        Integer objeto = x; //Tratar os tipo primitivos(int) como classe de uma forma transparente ao compilador.

        System.out.println(objeto);

        //Unboxing.
        int y = objeto * 2;

        System.out.println(y);
    }
}