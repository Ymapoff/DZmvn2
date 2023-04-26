package ru.netology.servises;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class MoneyServiceTest {

    @Test
    public void testCountRestMonths1() {
        MoneyService service = new MoneyService();

        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountRestMonths2() {
        MoneyService service = new MoneyService();

        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}