package ru.netology.Cycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class WorkerTest {
        @ParameterizedTest
        @CsvFileSource(files = "src/test/resources/amount.csv")
        public void calculate(int income, int expenses, int threshold, int expected) {
            Worker service = new Worker();

            int actual = service.calculate(income, expenses, threshold);
            Assertions.assertEquals(expected,actual);



        }

}
