package ru.netology.javaqa.javaqahomework5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestServiceTest {
    @Test
    public void Income100_000() {
        RestService service = new RestService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        //System.out.println(expected + " == ? == " + actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Income10_000() {
        RestService service = new RestService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);
        //System.out.println(expected + " == ? == " + actual);
        Assertions.assertEquals(expected, actual);
    }
}
