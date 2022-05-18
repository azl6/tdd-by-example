package com.azold6.udemytesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(new Dollar(10), product);
        product = five.times(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    void testEquality() {
        Assertions.assertEquals(new Dollar(5), new Dollar(5));
        Assertions.assertNotEquals(new Dollar(5), new Dollar(8));
    }
}
