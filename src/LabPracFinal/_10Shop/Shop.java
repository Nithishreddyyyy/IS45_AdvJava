//package LabPracFinal._10Shop;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Optional;
//
//public class Shop implements ActionListener {
//    String user = "Amy";
//    String pass= "1234";
//    String un = "" , pw  = "" ;
//    int id;
//
//    JTextField userField,phoneField , itemIdField,quantityField,itemNameField;
//    JButton submitBtn;
//    double total = 0.0;
//
//    static HashMap<Long,Integer> users = new HashMap<>();
//    static List<Item> itemList = new ArrayList<>();
//    public Shop() {
//        while(!un.equals(user) || !pw.equals(pass)) {
//            un = JOptionPane.showInputDialog(null ,"Please enter your username and password");
//            if(!un.equals(user)) {
//                JOptionPane.showMessageDialog(null, "Please enter your username and password");
//            }else{
//                pw=JOptionPane.showInputDialog(null ,"Please enter your username and password");
//                if(!pw.equals(pass)) {
//                    JOptionPane.showMessageDialog(null, "Please enter your username and password");
//                }
//            }
//        }
//
//        long phone = Long.parseLong(JOptionPane.showInputDialog(null ,"Please enter your phone number"));
//        if (users.containsKey(phone)) {
//            id = users.get(phone);
//            JOptionPane.showMessageDialog(null, "Welcome User");
//        }else{
//            id = Integer.parseInt(JOptionPane.showInputDialog(null ,"New User , Enter new ID:"));
//            users.put(phone,id);
//        }
//        JFrame frame = new JFrame("Purchase Details");
//        frame.setSize(300,400);
//        frame.setLayout(new GridLayout(6,2));
//
//        userField = new JTextField(String.valueOf(id),20);;
//        userField.setEditable(false);
//
//        phoneField= new JTextField(String.valueOf(phone),20);
//        phoneField.setEditable(false);
//
//        itemIdField= new JTextField(20);
//        quantityField = new JTextField(20);
//        itemNameField = new JTextField(20);
//
//        submitBtn = new JButton("Submit");
//        submitBtn.addActionListener(this);
//
//        frame.add(new JLabel("User ID:"));
//        frame.add(userField);
//        frame.add(new JLabel("Phone Number:"));
//        frame.add(phoneField);
//        frame.add(new JLabel("Item ID:"));
//        frame.add(itemIdField);
//        frame.add(new JLabel("Quantity:"));
//        frame.add(quantityField);
//        frame.add(new JLabel("Item Name:"));
//        frame.add(itemNameField);
//        frame.add(new JLabel(""));
//        frame.add(submitBtn);
//
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    }
//
//    public void ActionPerformed(ActionEvent ae){
//        String enteredItemId = itemIdField.getText().trim();
//        String enteredItemname = itemNameField.getText().trim();
//        int quantity;
//
//        try{
//            quantity = Integer.parseInt(quantityField.getText().trim());
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, "Invalid quantity entered!");
//            return;
//        }
//
//        String [] Discounts = {"5","10","15"};
//        int selected = JOptionPane.showOptionDialog(
//                null,
//                "Select Discount",
//                "Discount",
//                JOptionPane.DEFAULT_OPTION,
//                JOptionPane.INFORMATION_MESSAGE,
//                null,
//                Discounts,
//                Discounts[0]
//        );
//
//        Optional<Item> match = itemList.stream().filter(item -> item.id.equals(selected)).findFirst();
//
//    }
//}
//
