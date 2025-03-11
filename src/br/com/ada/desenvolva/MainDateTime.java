package br.com.ada.desenvolva;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class MainDateTime {

    public static void main(String[] args) {
        installments(120, 15);
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
