package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntsCalculatorTest {
    private final IntsCalculator CALC_INST = new IntsCalculator();
    private static final int NUMBER_3 = 3;
    private static final int NUMBER_4 = 4;

    @Test
    public void sumTestSuccess(){
        int expected = 7;
        int actual = CALC_INST.sum(NUMBER_3,NUMBER_4);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void multTestSussess(){
        int expected = 12;
        int actual = CALC_INST.mult(NUMBER_3,NUMBER_4);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void powTestSussess(){
        int expected = 81;
        int actual = CALC_INST.pow(NUMBER_3,NUMBER_4);
        Assertions.assertEquals(expected,actual);
    }
}
