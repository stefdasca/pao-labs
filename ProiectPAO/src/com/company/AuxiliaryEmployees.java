package com.company;

public class AuxiliaryEmployees extends Employees {
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public AuxiliaryEmployees(String job, String surname, int age, int salary, String s) {
        this.job = job;
    }
}
