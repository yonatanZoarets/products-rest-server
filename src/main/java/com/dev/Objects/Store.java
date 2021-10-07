package com.dev.Objects;

public class Store {
    private String name;
    private double cashback;

    public Store(String name, double cashback){
        this.name=name;
        this.cashback=cashback;
    }

    public void setCashback(int cashback) {
        this.cashback = cashback;
    }
}
