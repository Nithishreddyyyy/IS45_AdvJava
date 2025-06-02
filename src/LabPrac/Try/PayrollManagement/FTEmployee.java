package LabPrac.Try.PayrollManagement;

public class FTEmployee extends Employee implements payable{
    public FTEmployee(String name,String designation , double monthlySal , int age){
        super(name,designation,monthlySal,age);
    }

    public double calculate(){
        return this.salary;
    }

    public String toString(){
        return "Fulltime Employee\n" + super.toString() + "monthly sal: " + calculate();
    }

}
