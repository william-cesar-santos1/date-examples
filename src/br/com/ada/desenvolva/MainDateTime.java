package br.com.ada.desenvolva;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MainDateTime {

    public static void main(String[] args) {
//        installments(120, 15);
//        LocalTime first = LocalTime.of(8, 30);
//        LocalTime second = LocalTime.of(12, 00);
        // Calcular a quantidade de horas entre dois horários
        // Dado que eu possua o horário de 08:00 e 12:00,
        // desejo saber quantas horas se passaram
//        first.until(second, ChronoUnit.HOURS);
//        var spentTime = Duration.between(first, second);
//        System.out.println("Já se passaram " + spentTime.toHours() + ":"
//                + spentTime.toMinutesPart() + " horas");
        // dd - day
        // MM - month
        // yy - year
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        var currentDate = LocalDateTime.now();
        System.out.println(formatter.format(currentDate));

        var dateAsString = "10/03/2025 01:00";
        System.out.println(formatter.parse(dateAsString));
    }

    public static void installments(int amount, int dueDay) {
        var nextInstallment = LocalDate.now();
        nextInstallment = nextInstallment.withDayOfMonth(dueDay);
        for (int index = 0; index < amount; index++) {
            nextInstallment = nextInstallment.plusMonths(1);
            if (nextInstallment.getDayOfWeek() == DayOfWeek.SUNDAY) {
                System.out.println("A proxima parcela vence em " + nextInstallment.plusDays(1));
            } else {
                System.out.println("A proxima parcela vence em " + nextInstallment);
            }
        }
    }

}
