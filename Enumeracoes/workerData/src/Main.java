import entities.Department;
import entities.HourContract;
import entities.Worker;
import enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        /*Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
        * do usuário um mês e mostrar qual foi o salário do funcionário nesse mês.
        */
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String department = scanner.nextLine();

        System.out.println("Enter a worker data: ");

        System.out.print("Worker name: ");
        String workerName = scanner.nextLine();

        System.out.print("Level: ");
        String workerLevel = scanner.nextLine();

        System.out.print("Base salary: $");
        double baseSalary = scanner.nextDouble();

        //Instanciando um novo objeto do tipo WORKER. Os dados deste objeto serão definidos pelas variáveis acima
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(department));

        System.out.print("How many contracts to this worker? ");
        int numberContracts = scanner.nextInt();

        //Para ler os contratos preciso criar um for().
        for (int i = 1; i <= numberContracts ; i++) {

            System.out.printf("Enter contract #%d data: ", i);

            //Chamando a data formatada.
            System.out.print("Data (DD/MM/YYYY): ");
            Date contractDate = simpleDateFormat.parse(scanner.next());

            System.out.print("");

            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();

            System.out.print("");

            System.out.print("Duration (Hours): ");
            int hours = scanner.nextInt();

            //Condição para instanciar o contrato.
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);

            //Associando o contrato com o trabalhador.
            worker.addContract(contract);
        }
        //Então esse for repetirá várias vezes (3) até instanciar todos os contratos e associá-los ao trabalhador.

        System.out.println();

        System.out.print("Enter month and year to calculate income (MM/YYYY)");
        String monthAndYear = scanner.next();

        //Recortando as Strings, pegando os 2 primeiros caracteres, convertendo-os para Inteiros e armazenando em 2 variáveis (mês/ano).
        int month = Integer.parseInt(monthAndYear.substring(0, 2)); //Coletando os Strings linha 0,0 / 0,1 / 0,2 (MM/).
        int year = Integer.parseInt(monthAndYear.substring(3)); //Coletando os Strings linha 0,3 / 0,4 / 0,5 / 0,6 (YYYY).


        System.out.printf("Name: %s", worker.getName());
        System.out.printf("Department: %s", worker.getDepartment().getName());
        System.out.printf("Income for %s: %f", monthAndYear, worker.income(year, month));

        scanner.close();

    }
}