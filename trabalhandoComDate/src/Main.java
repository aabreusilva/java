import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {

        //Padrão ISO 8601 e classe Instant.
        //Exemplo: "2018-06-25T15:42:07Z".
        //Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        /*
        * Um objeto Date Internamente armazena:
        * - O número de milissegundos desde a meia-noite di dua 1 de janeiro de 1970 GMT(UTC).
        * - GMT: Greenwich Mean Time(time zone).
        * - UTC: Coordinated Universal Time (time standard).
        */

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        //Imprimindo uma data em formato UTC
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        //Transformando em formato GMT.
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        //Instanciando uma data atual (criando uma data).
        Date x1 = new Date();

        //Outra forma de criar uma data atual, convertendo em milissegundos
        Date x2 = new Date(System.currentTimeMillis());

        //Passando um número de milissegundos qualquer.
        Date x3 = new Date(0L);

        //Criando a data 01/01/1970, porém com um horário específico (5h).
        //1s = 1000ms * 60L(1 minuto) * 60L(1 hora) * 5L(5 horas).
        Date x4 = new Date(1000L * 60L * 60L * 5L);


        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");

        //Instanciando uma data ISO 8601 no padrão UTC.
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        //Imprimindo as datas em um formato padrão do java.
        //Data do Brasil.
        System.out.println("Y1: " + y1);
        System.out.println("Y1: " + y2);

        System.out.println("----------");

        //Utilizando as Datas com horas, minutos e segundos.
        System.out.println("Y1 formatado: " + sdf2.format(y1));
        System.out.println("Y2 formatado: " + sdf2.format(y2));

        System.out.println("----------");

        //Apresentando a data atual.
        //Apresentando formatada também.
        System.out.println("Data atual:(X1) " + x1);
        System.out.println("Data atual formatada:(X1) " + sdf2.format(x1));

        System.out.println("----------");

        //Apresentando a data atual em milissegundos.
        //E também apresentando formatado.
        System.out.println("Data atual em milissegundos:(X2) " + x2);
        System.out.println("Data atual em milissegundos formatado:(X2) " + sdf2.format(x2));

        System.out.println("----------");

        //Apresentando a data atual com um número em milissegundos declarado.
        //E agora formatado.
        //Aparecerá 31/12/1969 21h por que meu computador está no horário de brasília que é -3h.
        System.out.println("Data atual em milissegundos com um número declarado: (X3): " + x3);
        System.out.println("Data atual em milissegundos com um número declarado formatado: (X3): " + sdf2.format(x3));

        System.out.println("----------");

        //Apresentando o horário de 5h do dia 01/01/1970.
        //Aparecerá 02h da manhã, pois minha maquina é -3h.
        System.out.println("Data 01/01/1970 em horário específico: " + x4);
        System.out.println("Data 01/01/1970 em horário específico formatado: " + sdf2.format(x4));

        System.out.println("----------");

        //Imprimindo a data ISO 8601 no padrão UTC.
        System.out.println("Data ISO 8601 UTC padrão: " + y3);
        System.out.println("Data ISO 8601 UTC formatada: " + sdf2.format(y3));

        System.out.println("----------");

        //Datas em formato GMT.
        System.out.println("X1: " + sdf3.format(x1));
        System.out.println("X2: " + sdf3.format(x2));
        System.out.println("X3: " + sdf3.format(x3));
        System.out.println("X4: " + sdf3.format(x4));

        System.out.println("----------");

        //Y1, 2 e 3 em formato GMT incluindo a ISO 8601.
        System.out.println("Y1: " + sdf3.format(y1));
        System.out.println("Y2: " + sdf3.format(y2));
        System.out.println("Y3: " + sdf3.format(y3));

        System.out.println("----------");

        //Imprimindo as datas sem formatar.
        System.out.println("X1: " + x1);
        System.out.println("X2: " + x2);
        System.out.println("X3: " + x3);
        System.out.println("X4: " + x4);

        System.out.println("----------");

        System.out.println("Y1: " + y1);
        System.out.println("Y2: " + y2);
        System.out.println("Y3: " + y3);
    }
}