package LabPrac.Try.PayrollManagement;

public class PTEmployee extends Employee implements payable{
    int hoursWorked;
    double hourlyRate;

    public PTEmployee(String name , String designation , int age, int hoursWorked , double hourlyRate) {
        super(name,designation,0,age);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculate(){
        return this.hoursWorked * this.hourlyRate;
    }
    public String toString(){
        return "PTE Employee\n" + super.toString() + "Money given: " + calculate();
    }
}
