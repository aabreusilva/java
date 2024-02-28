import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Criando uma lista de tipo int (INTEGER). Obs: não aceita tipos primitivos (int).
        List<String> lista = new ArrayList<>();

        lista.add("Alexandre");
        lista.add("Edson");
        lista.add("Ana");
        lista.add("Fabrício");
        lista.add("Maria");

        //Inserindo um novo elemento na posição 2 da lista.
        lista.add(2, "Luiz");

        //Como ver o tamanho da lista?
        System.out.println("Tamanho da lista: " + lista.size());

        //Como remover um item da lista? (Ela remove um dado a partir da comparação do valor dele com outro).
        lista.remove("Ana");

        //Removendo um dado na posição 1 da lista.
        lista.remove(1);

        //O formato da variável precisa ser o mesmo da lista.
        for (String x : lista) {
            System.out.println(x);
        }

        //Removendo elementos que atendam a um predicado.
        //Removendo todos que começam com a letra M.
        lista.removeIf(x -> x.charAt(0) == 'M');

        System.out.println();

        for (String x : lista) {
            System.out.println(x);
        }

        System.out.println();

        //Encontrar a posição de um elemento.
        System.out.println("Index of Alexandre: Position " + lista.indexOf("Alexandre"));

        //Buscando um dado que não existe na lista. Quando ele não encontra o elemento ele retorna -1.
        System.out.println("Index of Maria: " + lista.indexOf("Maria"));

        System.out.println();

        //Deixando na lista o nome de pessoas que começam com A.(STREAM não é compatível com a LISTA então, devemos converter pata lista(.collect(Collectors.toList)).
        List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : resultado) {
            System.out.println(x);
        }

        System.out.println();

        //Encontrando um elemento que atenda um certo predicado.
        //Encontrando o primeiro elemento que comece com a letra A de certa lista.
        //Caso o elemento que não comece com a letra A não exista, ele retornara nulo com a função findFirst().orElse(null);
        String nome = lista.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(nome);
    }
}