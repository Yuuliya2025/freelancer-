package ru.netology.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

    class FreelancerServiceTest {

        @Test
        void shouldCalculateThreeMonthsOfRest() {
            FreelancerService service = new FreelancerService();
            int result = service.calculateMonthsOfRest(10000, 3000, 20000);
            assertEquals(3, result);
        }

        @Test
        void shouldCalculateTwoMonthsOfRest() {
            FreelancerService service = new FreelancerService();
            int result = service.calculateMonthsOfRest(100000, 60000, 150000);
            assertEquals(2, result);
        }
    }

