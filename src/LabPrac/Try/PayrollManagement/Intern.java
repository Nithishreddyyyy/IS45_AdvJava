package LabPrac.Try.PayrollManagement;

public class Intern extends Employee implements payable{
    public Intern(String name , String designation , double Stipend , int age){
        super(name, designation, Stipend, age);
    }

    public double calculate(){
        return this.salary;
    }

    public String toString(){
        return "Intern\n" + super.toString() + "Salary: " + calculate();
    }


}
