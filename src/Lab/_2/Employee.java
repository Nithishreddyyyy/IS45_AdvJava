package Lab._2;

// WAP to create a class a called Employee with the following data members name job title basic_pay HRA(house rent allowllance) DA gross_pay use a parameterised constructor
// To initialize the values of name jobtitle and basic pay
// DA is 150% of basic pay
// HRA is 30% of basic pay
// Create two objects for the employee class
import java.util.*;
class employee{
    String Name,Jobtitle;
    double basic_pay,HRA,DA;
    employee(String Name,String Jobtitle, double basic_pay ){
        this.Name = Name;
        this.Jobtitle=Jobtitle;
        this.basic_pay=basic_pay;
    }
    void compute(){
        double HRA =  0.3 * basic_pay;
        double DA = 1.5* basic_pay;
        double total = basic_pay + HRA + DA;
        System.out.println("--SALARY--");
        System.out.println("Jobtitle: "+Jobtitle+"\tBasic Pay: "+basic_pay+"\nHRA: "+HRA+"\tDA: "+DA );
        System.out.println("---");
    }

}
class Main{
    public static void main(String [] args){
        String Job1,Job2;
        String Name1,Name2;
        double pay1,pay2;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter Name: ");
        Name1=S.next();
        System.out.print("\nEnter Job Title: ");
        Job1 = S.next();
        System.out.print("\nEnter Basic Pay: ");
        pay1 = S.nextDouble();
        employee E1 = new employee(Name1,Job1,pay1);
        E1.compute();

        System.out.print("\nEnter Name: ");
        Name2=S.next();
        System.out.println("\nEnter Job Title: ");
        Job2 = S.next();
        System.out.println("\nEnter Basic Pay: ");
        pay2 = S.nextDouble();
        employee E2 = new employee(Name2,Job2,pay2);
        E2.compute();

    }
}