package entities;

import enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department; //Department associa a Worker.

    //Composição tem muitos.
    private final List<HourContract> contracts = new ArrayList<>();//Como o trabalhador possui vários contratos, vamos ter de representar como uma lista.

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }
    //Department associa a Worker.

    public List<HourContract> getContracts() {
        return contracts;
    }

    //NÃO POSSO TROCAR ESSA LISTA POR OUTRA LISTA.
    //public void setContracts(List<HourContract> contracts) {
    //this.contracts = contracts;
    //}


    //IMPORTANT IMPORTANT IMPORTANT


    public void addContract(HourContract contract) { //Adicionando contratos.
        contracts.add(contract);
    }

    //Removendo contratos.
    public void removeContracts(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {

        Calendar calendar = Calendar.getInstance(); //Mexendo com datas utilizando o Calendar.

        double sum = baseSalary;

        for (HourContract c : contracts) {

            calendar.setTime(c.getDate()); //Setando este calendário como a data do calendário do contrato C.
            int c_year = calendar.get(Calendar.YEAR); //Ano do contrato C.
            int c_month = 1 + calendar.get(Calendar.MONTH); //Mês do contrato C.

            if (year == c_year && month  == c_month) {
                sum += c.totalValue();
            }
        }

    }
}
