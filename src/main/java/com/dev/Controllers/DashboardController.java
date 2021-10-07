package com.dev.Controllers;

import com.dev.Objects.Category;
import com.dev.Objects.Store;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@RestController
public class DashboardController {
    private ArrayList<Store> stores = new ArrayList<>();
    private ArrayList<Category> categories=new ArrayList<>();
    @PostConstruct
    public void init () {
        System.out.println("This is init method");
        Store Ebay=new Store("Ebay",5);
        Store AliExpress=new Store("AliExpress",9);
        Store asos=new Store("Asos",4);
        Store Zipy=new Store("Zipy",5);
        Store Wish=new Store("Wish",1.5);
        Store Banggood= new Store("Banggood",10);
        stores.add(Ebay);
        stores.add(AliExpress);
        stores.add(asos);
        stores.add(Zipy);
        stores.add(Wish);
        stores.add(Banggood);

        categories.add(new Category("cashback",stores ));

    }
    @RequestMapping(value = "/stores", method = RequestMethod.GET)
    public Object stores() {
        return this.stores;
    }

    @RequestMapping(value = "/filter-categories", method = RequestMethod.GET)
    public Object filterCategories(int min, int max) {
        ArrayList<Category> filteredCategories =new ArrayList<Category>();
        for (Category category:categories){
            int num=category.getStores().size();
            if (num>=min && num<=max)
                filteredCategories.add(category);
        }
        return filteredCategories;
    }
}
