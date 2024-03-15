import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.getDefault());

        /* Representa um instante.
         * Pacote java.util
         * Um objeto Date internamente armazena:
         * -O número de milissegundos desde a meia noite do dia 1 de janeiro de 1970 GMT(UTC).
         * -GMT: Greenwich Mean Time (time zone).
         * -UTC: Coordinated Universal Time (time standard).
        */

        /* SimpleDateFormat:
         * -define formatos para conversão entre Date e String
         * -dd/MM/yyyy -> 23/07/2018
         * -dd/MM/yyyy HH:mm:ss -> 23/07/2018 15:42:07
        */

        /* Padrão ISO 8601 e classe Instant
         * -Formato: yyyy-MM-ddTHH:mm:ssZ
         * -Exemplo: "2018-06-25T15:42:07Z"
         * -Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        */

        SimpleDateFormat sdf1 = new SimpleDateFormat("ss/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("ss/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("ss/MM/yyyy HH:mm:ss");

        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        //Data atual.
        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());

        //Passando qualquer milissegundo.
        Date x3 = new Date(0L);

        Date x4 = new Date(1000L * 60L * 60L * 5L);

        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");

        //Instanciando uma data no padrão ISO 8601.
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println("x1: " + sdf2.format(x1));
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("x3: " + sdf2.format(x3));
        System.out.println("x4: " + sdf2.format(x4));
        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));
        System.out.println("y3: " + sdf2.format(y3));

        System.out.println("-----------------------");

        //Imprimindo todos em horário UTC.
        System.out.println("x1: " + sdf3.format(x1));
        System.out.println("x2: " + sdf3.format(x2));
        System.out.println("x3: " + sdf3.format(x3));
        System.out.println("x4: " + sdf3.format(x4));
        System.out.println("y1: " + sdf3.format(y1));
        System.out.println("y2: " + sdf3.format(y2));
        System.out.println("y3: " + sdf3.format(y3));

    }
}