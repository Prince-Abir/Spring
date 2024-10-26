package com.springcore.constructorInjection;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Items implements InitializingBean, DisposableBean {
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

//    public void init(){
//        System.out.println("I am from Init");
//
//    }
//
//    public void destroy(){
//        System.out.println("I am from Destroy");
//    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy...");
    }
}
