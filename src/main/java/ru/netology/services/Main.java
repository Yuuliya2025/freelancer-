package ru.netology.services;

    public class Main {
        public static void main(String[] args) {
            FreelancerService service = new FreelancerService();
            int result = service.calculateMonthsOfRest(100000, 60000, 150000);
            System.out.println("Количество месяцев отдыха: " + result);
        }
    }

