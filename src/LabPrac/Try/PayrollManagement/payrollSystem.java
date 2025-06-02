package LabPrac.Try.PayrollManagement;
import LabPrac.Try.PayrollManagement.*;
public class payrollSystem {
    public static void main(String[] args) {
        Employee [] emp = new Employee[10];

        emp [0] = new FTEmployee("nithish","SDE",1000,25);
        emp [1] = new PTEmployee("nithish","Part",25,3,300);
        emp [2] = new Intern("nithish","SDE",1000,25);

        for (Employee e : emp) {
            System.out.println(e.toString());
        }
    }
}
