package com.springcore.constructorInjection;


import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanLifeCycleWithAnnotations {

    private int price;
//    public Items(int price) {
//        this.price = price;
//    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @PostConstruct
    public void init() {
        System.out.println("I am from Init");

    }

    @PreDestroy
    public void destroy() {
        System.out.println("I am from Destroy");
    }


}
