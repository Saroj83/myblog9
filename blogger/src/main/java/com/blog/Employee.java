package com.blog;

public class Employee {



    private String name;

    private int salary;

    private String city;

    public Employee(String name, int salary, String city) {
        this.name = name;
        this.salary = salary;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }
}
