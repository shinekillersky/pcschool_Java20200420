package com.myjava.ocp.lab24;

import java.io.Serializable;

public class Employee implements Serializable {
    public static final long serialVersionUID = 1L; // 控管版本用的序號
    private String name;
    private int salary;
    // private transient int salary;  加上 transient 的屬性不會被序列化，只會傳送初始值
    private int age = 20;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", salary=" + salary + '}';
    }
}
