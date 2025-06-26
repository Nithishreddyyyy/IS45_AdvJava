package LabPracFinal._9CGPA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

public class Student_Management implements ActionListener {
    List<Student> arr = new ArrayList<>();
    static JFrame frm , frm1;
    JLabel name1,age1,addr1,usn1,category1,details,sgp1,sgp2,sgp3,sgp4,cgp1;
    JTextField name,age,addr,usn,category,sgpa1,sgpa2,sgpa3,sgpa4,cgp;
    JButton done,compute,complete;
    JTextArea jt;
    float cgpa;


    public Student_Management() {
        frm = new JFrame ("Student Management");
        frm1 = new JFrame ("Displaying ");

        name1 = new JLabel ("Name");
        age1 = new JLabel ("Age");
        usn1 = new JLabel ("USN");
        category1 = new JLabel ("Category");
        addr1 = new JLabel ("Address");
        details = new JLabel ("Details");

        jt = new JTextArea(100,100);
        name = new JTextField(20);
        age = new JTextField(20);
        usn = new JTextField(20);
        category = new JTextField(20);
        addr = new JTextField(20);

        sgp1= new JLabel ("SGPA1: ");
        sgpa1 = new JTextField(10);
        sgp2= new JLabel ("SGPA2: ");
        sgpa2 = new JTextField(10);
        sgp3= new JLabel ("SGPA3: ");
        sgpa3 = new JTextField(10);
        sgp4= new JLabel ("SGPA4: ");
        sgpa4 = new JTextField(10);

        cgp1 = new JLabel ("CGPA1: ");
        cgp = new JTextField(10);

        compute = new JButton("Compute");
        complete = new JButton("Complete");
        done = new JButton("Done");

        frm.add(name1); frm.add(name);
        frm.add(age1); frm.add(age);
        frm.add(usn1); frm.add(usn);
        frm.add(category1); frm.add(category);
        frm.add(addr1); frm.add(addr);
        frm.add(sgp1); frm.add(sgpa1);
        frm.add(sgp2); frm.add(sgpa2);
        frm.add(sgp3); frm.add(sgpa3);
        frm.add(sgp4); frm.add(sgpa4);
        frm.add(cgp1); frm.add(cgp);
        frm.add(category1); frm.add(category);
        frm.add(compute); frm.add(done); frm.add(complete);

        done.setVisible(false);
        complete.setVisible(false);

        frm1.add(details); frm1.add(jt);

        compute.addActionListener(this);
        complete.addActionListener(this);
        done.addActionListener(this);
    }

    public void actionPerformed (ActionEvent ae){
        if(ae.getSource() == compute){
            float t1 = Float.parseFloat(sgpa1.getText());
            float t2 = Float.parseFloat(sgpa2.getText());
            float t3 = Float.parseFloat(sgpa3.getText());
            float t4 = Float.parseFloat(sgpa4.getText());
            cgpa=(t1+t2+t3+t4)/4;

            cgp.setText("CGPA: "+cgpa);

            done.setVisible(true);
            complete.setVisible(true);
        }
        else if(ae.getSource() == done){
            String na = name.getText();
            String ad = addr.getText();
            String  us = usn.getText();
            String cat = category.getText();

            float t1 = Float.parseFloat(sgpa1.getText());
            float t2 = Float.parseFloat(sgpa2.getText());
            float t3 = Float.parseFloat(sgpa3.getText());
            float t4 = Float.parseFloat(sgpa4.getText());

            int ag = Integer.parseInt(age.getText());

            if(ag < 18){
                JOptionPane.showMessageDialog(null,"ENTER age above 18");
            }
            else{
                Student temp = new Student(na,us,ad,cat,ag,t1,t2,t3,t4);
                arr.add(temp);
            }
        }
        else if(ae.getSource() == complete){
            jt.setText("");
            for (Student student : arr) {
                jt.append(student +"\n");
            }
        }
    }

    public static void main(String[] args) {
        Student_Management obj = new Student_Management();
        frm.setVisible(true);
        frm.setSize(300,400);
        frm.setLayout(new GridLayout(6,1));

        frm1.setVisible(true);
        frm1.setSize(300,400);
    }
}