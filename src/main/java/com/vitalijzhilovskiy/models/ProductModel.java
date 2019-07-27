package com.vitalijzhilovskiy.models;

import com.vitalijzhilovskiy.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductModel {

    private List<Product> products;

    public ProductModel(){
        this.products = new ArrayList<Product>();
        this.products.add(new Product("1", "free", "free.jpj", 40.20));
        this.products.add(new Product("2", "meat", "meat.jpj", 230.50));
        this.products.add(new Product("3", "pizza", "pizza.jpj", 180.00));
        this.products.add(new Product("4", "salad", "salad.jpj", 75.30));

    }
    public List<Product> findAll(){
        return this.products;
    }
    public Product find(String id){
        for (Product product:this.products) {
            if (product.getId().equalsIgnoreCase(id)){
                return product;
            }
        }
        return null;
    }
}
