package AnnotationBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"AnnotationBasedConfiguration"})
public class AppConfig {

//    @Bean("result")
//    public Result getResult(){
//        return new Result(3.3);
//    }
//
//    @Bean(name = {"student","con","myStudent"})
//    public Student getStudent(){
//
//        Student student = new Student("Abir",2,getResult());
//        return student;
//    }





}
