package com.iakgoog.app.one;

public class Dollar
{
    int amount;

    Dollar(int amount)
    {
        this.amount = amount;
    }

    void times(int multiplier)
    {
        amount *= multiplier;
    }
}