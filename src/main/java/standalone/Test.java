package standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        System.out.println("Main...");

        ApplicationContext context = new ClassPathXmlApplicationContext("standalone.xml");
        Person person1 = context.getBean("person1", Person.class);

        System.out.println(person1.getName());
        System.out.println(person1.getPhones());
        System.out.println(person1.getAddresses());
        System.out.println(person1.getCourses());
        System.out.println(person1.getPros());
    }
}
