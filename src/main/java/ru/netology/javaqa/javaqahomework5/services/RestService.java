package ru.netology.javaqa.javaqahomework5.services;

public class RestService {
    public int calculate(int income, int expenses, int threshold) {
        int months = 0; // счётчик месяцев отдыха
        int cash = 0; // количество денег на счету
        for (int month = 1; month <= 12; month++) {
            if (cash >= threshold) { // можем ли отдыхать?
                months++; // увеличиваем счётчик месяцев отдыха
                System.out.println("Месяц " + month + " Денег " + cash + " Отдыхаем " + " Потратил -" + expenses + " Затем ещё -" + (cash - expenses - (cash - expenses) / 3));
                cash = cash - expenses - (cash - expenses - (cash - expenses) / 3);
            } else {
                System.out.println("Месяц " + month + " Денег " + cash + " Придется работать. Заработал +" + income + " Потратил -" + expenses);
                cash = cash + income - expenses;
            }
        }
        return months;

    }

}
