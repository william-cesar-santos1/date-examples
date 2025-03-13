package br.com.ada.desenvolva.salary;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class MainSalary {

    static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yy");
    static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var week = workWeek(scanner);
        var salary = week.salary();
        System.out.println("O seu salário da semana é de " + salary);
        scanner.close();
    }

    private static WorkWeek workWeek(Scanner scanner) {
        System.out.println("Para calcular o salário precisamos de 7 dias trabalhados");
        var days = new ArrayList<WorkDay>();
        for (int index = 0; index < 2; index++) {
            var day = workDay(scanner);
            days.add(day);
        }
        return new WorkWeek(days);
    }

    private static WorkDay workDay(Scanner scanner) {
        System.out.println("Informe o dia(dd/mm/aa):");
        var value = scanner.nextLine();
        var day = LocalDate.parse(value, dateFormatter);

        System.out.println("Informe o valor da hora nesse dia(0.00):");
        value = scanner.nextLine();
        var hourRate = new BigDecimal(value);

        System.out.println("Informe os dados da manhã");
        var morning = workShift(scanner);

        System.out.println("Informe os dados da tarde");
        var afternoon = workShift(scanner);

        return new WorkDay(morning, afternoon, hourRate, day);
    }

    private static WorkShift workShift(Scanner scanner) {
        System.out.println("Informe a hora de inicio(hh:mm):");
        var value = scanner.nextLine();
        var start = LocalTime.parse(value, timeFormatter);

        System.out.println("Informe a hora de saída(hh:mm):");
        value = scanner.nextLine();
        var end = LocalTime.parse(value, timeFormatter);

        return new WorkShift(start, end);
    }

}
