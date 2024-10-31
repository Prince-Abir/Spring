package Stereotype;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("st1")
@Scope("prototype")
public class Student {


    @Value("Abir")
    private String name;
    @Value("#{11+29}")
    private String id;
    @Value("#{5>3?4:3}")
    private double cgpa;

    @Value("#{phones}")
    List<String> phones;

    @Value("#{T(Stereotype.Grade).mark()}")
    public String text;

    @Value("#{5>2}")
    private boolean status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", cgpa=" + cgpa +
                ", phones=" + phones +
                ", text='" + text + '\'' +
                ", status=" + status +
                '}';
    }
}
