package autowirebyannotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("autoconfigbyannotation.xml");

        Employee emp1 = (Employee) context.getBean("emp1");

        System.out.println(emp1);

    }

}