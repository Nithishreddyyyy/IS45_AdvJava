package LabPrac.Try.Practice.Telephone;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TeleMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Nithish",1234L));
        contacts.add(new Contact("Anushree",1213L));

        List<MissedCall> missedCalls = new LinkedList<>();
        while(true){
            System.out.println("1. Add Missed Call");
            System.out.println("2. List and Del Missed Call");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter Missed call:");
                    long miss = Long.parseLong(sc.nextLine());
                    String name = "pvt Called";

                    for(Contact c : contacts){
                        if(c.number == miss){
                            name = c.name;
                            break;
                        }
                    }

                    if(missedCalls.size()>=3){
                        MissedCall removed = missedCalls.removeFirst();
                        System.out.println("Removed Missed call: " + removed);
                    }
                    missedCalls.add(new MissedCall(LocalTime.now(),name,miss));
                    System.out.println("missed call added");
                    break;
                case 2:
                    List<MissedCall> delCall = new ArrayList<>();
                    for (MissedCall m : missedCalls) {
                        System.out.println("Missed call: " + m);
                        System.out.println("Do you want to delete : 1 for yes");
                        int input = sc.nextInt();
                        if(input == 1){
                            delCall.add(m);
                        }
                    }
                    missedCalls.removeAll(delCall);
                    break;
                case 3:
                    System.out.println("Exiting....");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }


        }

    }
}
