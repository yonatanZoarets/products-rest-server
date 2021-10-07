package com.dev.Objects;

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Store> stores;

    public Category(String name, ArrayList stores) {
        this.name = name;
        this.stores = stores;
    }

    public ArrayList<Store> getStores() {
        return stores;
    }
}
