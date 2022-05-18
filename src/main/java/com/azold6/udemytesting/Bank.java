package com.azold6.udemytesting;

public class Bank {

    Money reduce(Expression source, String toCurrency) {
        return source.reduce(toCurrency);
    }
}
