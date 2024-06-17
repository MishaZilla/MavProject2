package ru.netology.javaqa.javaqamvn.services;

public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;
        for (int month = 1; month < 13; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        System.out.println("Количество месяцев отдыха:");
        return count;
    }
}
