package Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("streotypeconfig.xml");
        Student student1 = context.getBean("st1", Student.class);
        System.out.println(student1.hashCode());
        System.out.println(student1);

        Student student2 = context.getBean("st1", Student.class);
        System.out.println(student2.hashCode());



    }
}
