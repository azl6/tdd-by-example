package com.azold6.udemytesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    void testMultiplicationDollar() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10), product);
        product = five.times(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    void testEqualityDollar() {
        Assertions.assertEquals(new Dollar(5), new Dollar(5));
        Assertions.assertNotEquals(new Dollar(5), new Dollar(8));
    }

    @Test
    void testMultiplicationFranc() {
       Franc five = new Franc(5);
       Franc product = five.times(10);
       Assertions.assertEquals(new Franc(50), product);
    }

    @Test
    void testEqualityFranc() {
        Assertions.assertEquals(new Franc(5), new Franc(5));
        Assertions.assertNotEquals(new Franc(5), new Franc(8));
    }
}
