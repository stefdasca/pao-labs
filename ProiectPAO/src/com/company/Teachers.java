package com.company;

public class Teachers extends Employees{
    private String subjecttaught;

    public String getSubjecttaught() {
        return subjecttaught;
    }

    public void setSubjecttaught(String subjecttaught) {
        this.subjecttaught = subjecttaught;
    }

    public Teachers(String subjecttaught, String surname, int age, int salary, String s) {
        super();
        this.subjecttaught = subjecttaught;
    }
}
