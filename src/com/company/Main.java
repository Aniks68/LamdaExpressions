package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        new Thread(()-> {
            System.out.println("Testing the printing from Runnable");
            System.out.println("Line 2");
            System.out.println("Line 3");
            System.out.println("==============");
        }).start();

        Employee john = new Employee("John", 34);
        Employee tim = new Employee("Timon", 17);
        Employee garcia = new Employee("Grace", 24);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(tim);
        employeeList.add(garcia);
        employeeList.add(john);

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Employee employee : employeeList) {
            System.out.println(employee.getName());
        }
	// write your code here
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from the Runnable");
//            }
//        }).start();
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}