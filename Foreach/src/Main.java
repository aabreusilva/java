public class Main {
    public static void main(String[] args) {

        String [] vetor = new String[] {"Alexandre", "Fabricio", "Carolina"};

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        System.out.println("----------------------------------------");

        //foreach.
        for (String objeto : vetor) {
            System.out.println(objeto);
        }
    }
}