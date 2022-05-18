package com.azold6.udemytesting;

public class Money {

    protected int amount;

    public Money(int amount){
        this.amount = amount;
    }

    public Money(){}

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && this.getClass().equals(object.getClass());
    }

    Money times(int multiplier){
        return new Money(this.amount *= multiplier);
    }
}
