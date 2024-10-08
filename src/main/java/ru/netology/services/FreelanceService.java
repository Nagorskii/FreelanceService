package ru.netology.services;

public class FreelanceService {
    public int calculate(int income, int expenses, int threshold) {

        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            // отдыхаем
            if (money >= threshold) {
                money -= expenses;
                money /= 3;
                count++;
            } else {
                // работаем
                money += income;
                money -= expenses;
            }
        }
        return count;
    }
}
