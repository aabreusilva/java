import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        //Cálculos com data-hora.
        //Data-hora +/- tempo → data-hora.
        //Data-hora 1, data-hora 2 → Duração.

        //Subtraindo 20 - 7 dias.
        LocalDate pastWeekLocalDate = d01.minusDays(7);
        //Agora aumentando 7 dias.
        LocalDate nextWeekLocaldate = d01.plusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocaldate);

        //Manipulando years now.
        LocalDate nextYearLocalDate = d01.plusYears(7);
        System.out.println("nextYearLocalDate = " + nextYearLocalDate);

        //Quebra de linha.
        System.out.println();

        //Utilizando o LocalDateTime.
        //Manipulando minutos.
        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

        System.out.println("pastMinutesLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextMinutesLocalDateTime = " + nextWeekLocalDateTime);

        //Quebra de linha.
        System.out.println();

        //Quando se trata do Instant, não será o mesmo que LocalDate e LocalDateTime.
        //Mais preciso em parâmetros: d03.plus(+ options) d03.minus(+ options).
        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        //Quebra de linha.
        System.out.println();

        //Data-hora 1, data-hora 2 → Duração.
        //Calculando a duração entre as duas datas.
        //Class Duration.

        //Não se calcula sem a unidade de medida segundos.
        //Precisamos converter LocalDate para LocalDateTime utilizando o .atTime(0, 0).
        //Outra opção para converter em LocalDateTime é: atStartOfDay()
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d02);
        Duration t3 = Duration.between(pastWeekInstant, d03);
        Duration t4 = Duration.between(d03, pastWeekInstant);

        //Outras opções .to???();
        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());


    }
}