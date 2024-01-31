package com.blog;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;



public class SteamApi {

    public static void main(String[] args) {


        List<Employee> names = Arrays.asList(new Employee("mike",5000,"Bangalore") ,
                new Employee("smith",10000,"chennai") , new Employee("ram",5000,"pune")
                );

        Map<Integer, List<Employee>> groups = names.stream().collect(Collectors.groupingBy(Employee::getSalary));
        System.out.println(groups);

        for (Map.Entry<Integer,List<Employee>> entry: groups.entrySet()) {

            double salary = entry.getKey();
            List<Employee> employeeList = entry.getValue();
            System.out.println("Employee with salary " + salary + ":");
            for (Employee employee:employeeList) {
                System.out.println("\t" + employee.getName());
            }

        }

    }

//        Employee emp1 = new Employee();
//        emp1.setName("Mike");
//        emp1.setCity("Bangalore");
//        emp1.setSalary(10000);
//
//        Employee emp2 = new Employee();
//        emp2.setName("Mithun");
//        emp2.setCity("Chennai");
//        emp2.setSalary(5000);
//
//        Employee emp3 = new Employee();
//        emp3.setName("smith");
//        emp3.setCity("pune");
//        emp3.setSalary(10000);
//
//        Employee emp4 = new Employee();
//        emp4.setName("virat");
//        emp4.setCity("Delhi");
//        emp4.setSalary(12000);
//
//        List<Employee> data = Arrays.asList(emp1,emp2,emp3,emp4);
//        List<Employee> newData = data.stream().filter(e -> e.getCity().equalsIgnoreCase("delhi") ).collect(Collectors.toList());
//
//        for (Employee employee:newData) {
//            System.out.println(employee.getName());
//            System.out.println(employee.getCity());
//            System.out.println(employee.getSalary());
//        }
//    }
}
