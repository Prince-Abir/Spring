package com.springcore;

import com.springcore.constructorInjection.BeanLifeCycleWithAnnotations;
import com.springcore.constructorInjection.Company;
import com.springcore.constructorInjection.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Configuration
@ComponentScan(basePackages = "com.springcore.constructorInjection")
public class Main {
    public static void main(String[] args) {


//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        Student student = (Student) context.getBean("student");
//        System.out.println(student);


        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(Main.class);

//        context1.registerShutdownHook();
//        Company c = (Company) context1.getBean("company");
//        System.out.println(c.getCompanyName());
//        System.out.println(c.getTotalEmployee());
//        System.out.println(c.getJobs().getJobTitle());
//        System.out.println(c.getJobs().getSalary());

//        Company c1 = (Company) context1.getBean("company2");
//        System.out.println(c1.getCompanyName());
//        System.out.println(c1.getTotalEmployee());
//        System.out.println(c1.getJobs().getJobTitle());
//        System.out.println(c1.getJobs().getSalary());

//        Items item1 = (Items) context1.getBean("item1");
//        System.out.println(item1);

//        Items item2 = (Items) context1.getBean("item2");
//        System.out.println(item2);
//
        BeanLifeCycleWithAnnotations product = (BeanLifeCycleWithAnnotations) context1.getBean(BeanLifeCycleWithAnnotations.class);
        System.out.println(product);

        context1.close();


    }


}