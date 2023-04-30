package ru.netology.javaqa.javaqahomework5.services;

public class Main {
    public static void main(String[] args) {

        RestService service = new RestService();

        int expected = 3;
        int actual = service.calculate(100_000, 60_000, 150_000);
        System.out.println(expected + " == ? == " + actual);

    }
}