package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacation.csv")
    public void whenVacation(int income, int expenses, int threshold) {
        VacationService service = new VacationService();

        int end = service.calculate(income, expenses, threshold);

        System.out.println(end);
    }

//    @Test
//    public void whenVacation2() {
//        VacationService service = new VacationService();
//
//        int end = service.calculate(100_000, 60_000, 150_000);
//
//        System.out.println(end);
//    }

}
