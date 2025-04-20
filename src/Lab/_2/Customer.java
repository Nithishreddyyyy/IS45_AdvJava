package Lab._2;
import java.util.*;
class Customer{
    String firstName,lastName,emailID;
    int phNo;
    double serviceCharge;
}

class Regular_Customer extends Customer{

    Regular_Customer(String firstName,String lastName,String emailID,int phNo,double serviceCharge){
        this.firstName=firstName;
        this.lastName=lastName;
        this.emailID=emailID;
        this.phNo=phNo;
        this.serviceCharge  = serviceCharge;
    }
    void Compute(){
        double total = .8*serviceCharge;
        System.out.println("PAID: "+total);
    }
}

class Senior_Citizen extends Customer{
    Senior_Citizen(String firstName,String lastName,String emailID,int phNo,double serviceCharge){
        this.firstName=firstName;
        this.lastName=lastName;
        this.emailID=emailID;
        this.phNo=phNo;
        this.serviceCharge  = serviceCharge;
    }
    void Compute() {
        double total = .5 * serviceCharge;
        System.out.println("PAID: "+total);
    }

}

class Test{
    public static void main(String [] args){

        Scanner S = new Scanner(System.in);
        System.out.println("---Regular Customer---");
        System.out.print("Enter First Name: ");
        String FN1= S.next();
        System.out.print("\nEnter Last Name: ");
        String LN1 = S.next();
        System.out.print("\nEnter Email: ");
        String E1 = S.next();
        System.out.print("\nEnter Mobile No: ");
        int Ph1 = S.nextInt();
        System.out.print("\nEnter Serice charge: ");
        double S1 = S.nextDouble();
        Regular_Customer Re = new Regular_Customer(FN1,LN1,E1,Ph1,S1);
        Re.Compute();


        System.out.println("---Senior Citizen---");
        System.out.print("Enter First Name: ");
        String FN2= S.next();
        System.out.print("\nEnter Last Name: ");
        String LN2 = S.next();
        System.out.print("\nEnter Email: ");
        String E2 = S.next();
        System.out.print("\nEnter Mobile No: ");
        int Ph2 = S.nextInt();
        System.out.print("\nEnter Serice charge: ");
        double S2 = S.nextDouble();
        Senior_Citizen Se = new Senior_Citizen(FN2,LN2,E2,Ph2,S2);
        Se.Compute();



    }
}
