package ru.netology.Cycles.services;

public class Worker {


    public int calculate(int income, int expenses, int threshold) {
        int restMonths = 0;
        int money = 0; // текущий баланс

        // моделирование работы и отдыха в течение года
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money = (money - expenses) / 3;
                restMonths++;
            } else {
                money = money + income - expenses;
            }
        }

        return restMonths;
    }
}

