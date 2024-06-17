package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Test;

public class VacationServiceTest {

    @Test
    public void whenVacation1() {
        VacationService service = new VacationService();

        int end = service.calculate(10000, 3000, 20000);

        System.out.println(end);
    }

    @Test
    public void whenVacation2() {
        VacationService service = new VacationService();

        int end = service.calculate(100_000, 60_000, 150_000);

        System.out.println(end);
    }

}
