package ru.netology.services;

    public class FreelancerService {
        public int calculateMonthsOfRest(int income, int expenses, int threshold) {
            int balance = 0;
            int monthsOfRest = 0;

            for (int month = 1; month <= 12; month++) {
                if (balance >= threshold) {
                    // Отдыхаем
                    balance -= expenses;
                    balance /= 3;
                    monthsOfRest++;
                } else {
                    // Работаем
                    balance += income - expenses;
                }
            }

            return monthsOfRest;
        }
    }


