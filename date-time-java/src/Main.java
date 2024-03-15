import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Criando um outro objeto para corrigir o erro.
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        //Dia atual.
        LocalDate d01 = LocalDate.now();
        //Data + Relógio exato.
        LocalDateTime d02 = LocalDateTime.now();
        //Gerando um horário GMT de Londres (Padrão).
        Instant d03 = Instant.now();
        //ISO 8601.
        LocalDate d04 = LocalDate.parse("2022-07-22");
        //Horário ISO 8601.
        LocalDateTime d05 = LocalDateTime.parse("2022-07-22T01:30:26");
        //Gerando uma data/hora no padrão UTC.
        Instant d06 = Instant.parse("2022-07-22T01:30:26Z");
        //Especificando um timezone diferente (aumentando + 3h).
        Instant d07 = Instant.parse("2022-07-22T01:30:26-03:00");
        //Texto com  formato customizado.
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        //Utilizando o formato dd/MM/yyyy.
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
        //Instanciando datas a partir de dados isolados.
        LocalDate d10 = LocalDate.of(2022, 7, 22);
        //Instanciar com o dia e horário.
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 22, 1, 30);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);
    }
}