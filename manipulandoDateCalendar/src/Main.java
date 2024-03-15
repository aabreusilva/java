import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Somando uma unidade de tempo.
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        //Por padrão, imprimi 12:42:07 pois meu computador está configurado como GMT Brasília(-3h).
        Date date = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(date));

        //Instanciando a data definida acima num calendário.
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        //Agora podemos acrescentar X valores de dias, horas, segundos, etc dentro deste calendário.
        calendar.add(Calendar.HOUR_OF_DAY, 4);
        date = calendar.getTime();

        System.out.println(sdf.format(date));

        System.out.println("-----------------------------------------------------------------------------");

        //Obtendo uma unidade de tempo.
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date date1 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf1.format(date));

        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date1);
        int minutes = calendar1.get(Calendar.MINUTE);

        //Incrementar 1 no calendar pois o mês de janeiro equivale a 0.
        int month = 1 + calendar1.get(Calendar.MONTH);

        System.out.println("Minutos: " + minutes);
        System.out.println("Mês: " + month);
    }
}