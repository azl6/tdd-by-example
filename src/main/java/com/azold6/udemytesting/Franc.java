package com.azold6.udemytesting;

import java.util.Objects;

public class Franc {

    private int amount;
    public Franc(int amount){
        this.amount = amount;
    }

    Franc times(int multiplier){
        return new Franc(this.amount *= multiplier);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Franc franc = (Franc) o;
        return amount == franc.amount;
    }
}