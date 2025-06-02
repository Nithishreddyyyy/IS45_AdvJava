package LabPrac.Try.Tele;

import java.time.LocalTime;
import java.util.*;
import java.lang.*;
public class Manager {
    public static void main(String[] args) {
        List<Contact> cl = new ArrayList<>();
        cl.add(new Contact("Nithish",9380467390L));
        cl.add(new Contact("Bhav" , 1234567890L));

        List<MissedCall> mc = new ArrayList<>();
        Scanner sc = new Scanner (System.in);

        while (true){
            System.out.println("1. Add Missed call");
            System.out.println("2. Remove Missed call");
            System.out.println("3. Exit");
            System.out.print("Enter a choice:");
            int choice = sc.nextInt();

            switch(choice){
                case 1 :
                    System.out.println("enter the missed call: ");
                    long miss_call = sc.nextLong();                     //Check this

                    String name = "Private Called ";;
                    for (Contact c : cl){
                        if(c.number == miss_call){
                            name = c.name;
                            break;
                        }
                    }
                    if (mc.size() >= 3){
                        MissedCall removed = mc.remove(0);
                        System.out.println("Removed " + removed.number + " from missed calls");
                    }
                    mc.add(new MissedCall (LocalTime.now() , name , miss_call));
                    System.out.println("Missed call added");
                    break;

                case 2:
                    List<MissedCall> delCall = new ArrayList<>();
                    for(MissedCall m : mc){
                        System.out.println("Missedcall : "+m);
                        System.out.println("Do you want to delete the number if yes press 1 else anyother number");
                        int number = sc.nextInt();
                        if (number == 1){
                            delCall.add(m);
                        }
                    }
                    mc.removeAll(delCall);
                    break;

                case 3:
                    System.err.println("Exiting program....");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println(cl);
                    System.out.println(mc);
                    continue;
            }
        }
    }
}
