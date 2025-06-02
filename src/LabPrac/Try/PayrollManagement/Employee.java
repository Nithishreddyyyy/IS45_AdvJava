package LabPrac.Try.PayrollManagement;

public class Employee {
    String name,designation;
    double salary;
    int age;

    Employee(String name ,String designation, double salary , int age){
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.age = age;
    }


    public String toString(){
        return name+ " " + designation + " " + salary + " " + age;
    }
}
