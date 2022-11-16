package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SqrServiceTests {
    @Test
    public void test() {
        SqrService service = new SqrService();
        System.out.println(service.CalcSqr(200, 300));
    }


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void test_2(int x, int y) {
        SqrService service = new SqrService();
        int actual = service.CalcSqr(x, y);
        System.out.println(actual);
    }
}

