package ru.netology.javaqa.javaqahomework5.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class RestServiceTest {

@ParameterizedTest
@CsvFileSource(files="src/test/resources/rest.csv")
//@CsvSource({
//        "3,10000,3000,20000",
//        "2,100000,60000,150000"
//})
    public void TestIncomeRest(int expected, int income, int expenses, int threshold) {
        RestService service = new RestService();

       // int expected = 2;
        int actual = service.calculate(income, expenses, threshold);
        //System.out.println(expected + " == ? == " + actual);
        Assertions.assertEquals(expected, actual);
    }

   // @Test
   // public void Income10_000() {
     //   RestService service = new RestService();
       // int expected = 3;
        //int actual = service.calculate(10_000, 3_000, 20_000);
        //System.out.println(expected + " == ? == " + actual);
        //Assertions.assertEquals(expected, actual);
    //}
}