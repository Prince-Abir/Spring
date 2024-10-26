package com.springcore.constructorInjection;

public class Company {

    private String companyName;
    private int totalEmployee;
    private Jobs jobs;

    public Company(String companyName, int totalEmployee, Jobs jobs) {
        this.companyName = companyName;
        this.totalEmployee = totalEmployee;
        this.jobs = jobs;
    }

    public Company() {
        super();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getTotalEmployee() {
        return totalEmployee;
    }

    public void setTotalEmployee(int totalEmployee) {
        this.totalEmployee = totalEmployee;
    }

    public Jobs getJobs() {
        return jobs;
    }

    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }
}
