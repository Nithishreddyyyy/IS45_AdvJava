package LabPracFinal._4Palindrome;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentManagement implements ActionListener {
    ArrayList<Student> arr = new ArrayList<>();
    static JFrame frm , frm1;
    JLabel name1,age1,addr1,cat1Label, usn1,details,sgp1,sgp2,sgp3,sgp4,cgp;
    JTextField name,usn,addr,age,sgpa1,sgpa2,sgpa3,sgpa4,cgpa,cat1;
    JButton compute,done,complete;
    JTextArea jt;
    float CGPA;

    public StudentManagement() {
        frm = new JFrame("Student Management");
        frm1 = new JFrame("Display Details");

        name1 = new JLabel("Name");
        age1 = new JLabel("Age");
        addr1 = new JLabel("Address");
        cat1Label = new JLabel("Category");
        usn1 = new JLabel("USN");
        details = new JLabel("Details");
        sgp1 = new JLabel("SGPA1 ");
        sgp2 = new JLabel("SGPA2 ");
        sgp3 = new JLabel("SGPA3 ");
        sgp4 = new JLabel("SGPA4 ");
        cgp = new JLabel("CGPA ");

        name = new JTextField(10);
        usn = new JTextField(10);
        age = new JTextField(10);
        addr = new JTextField(10);
        cat1 = new JTextField(10);
        sgpa1 = new JTextField(10);
        sgpa2 = new JTextField(10);
        sgpa3 = new JTextField(10);
        sgpa4 = new JTextField(10);
        cgpa = new JTextField(10);
        cgpa.setEditable(false);

        compute = new JButton("Compute");
        done = new JButton("Done");
        complete = new JButton("Complete");
        jt = new JTextArea(20,20);
        jt.setEditable(false);


        frm.setLayout(new GridLayout(11,2));

        frm.add(name1); frm.add(name);
        frm.add(age1); frm.add(age);
        frm.add(addr1); frm.add(addr);
        frm.add(usn1); frm.add(usn);
        frm.add(sgp1); frm.add(sgpa1);
        frm.add(sgp2); frm.add(sgpa2);
        frm.add(sgp3); frm.add(sgpa3);
        frm.add(sgp4); frm.add(sgpa4);
        frm.add(cat1Label); frm.add(cat1);
        frm.add(cgp); frm.add(cgpa);
        frm.add(compute); frm.add(done);
        frm.add(complete);

        done.setVisible(true);
        complete.setVisible(true);

        frm1.setLayout(new BorderLayout());
        frm1.add(details,BorderLayout.NORTH);
        frm1.add(new JScrollPane(jt),BorderLayout.CENTER);

        compute.addActionListener(this);
        complete.addActionListener(this);
        done.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == compute){
            try{
                float t1= Float.parseFloat(sgpa1.getText());
                float t2= Float.parseFloat(sgpa2.getText());
                float t3= Float.parseFloat(sgpa3.getText());
                float t4= Float.parseFloat(sgpa4.getText());

                CGPA = (t1+t2+t3+t4)/4;
                cgpa.setText(String.format("%.2f",CGPA));

                done.setVisible(true);
                complete.setVisible(true);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Please enter valid SGPA");
            }
        }

        else if(e.getSource() == done){
            try{
                String n = name.getText();
                String u = usn.getText();
                String a = addr.getText();
                String c = cat1.getText();
                int x = Integer.parseInt(age.getText());

                float t1 = Float.parseFloat(sgpa1.getText());
                float t2 = Float.parseFloat(sgpa2.getText());
                float t3 = Float.parseFloat(sgpa3.getText());
                float t4 = Float.parseFloat(sgpa4.getText());

                if (x < 18) {
                    JOptionPane.showMessageDialog(null, "Age must be at least 18");
                    return;
                }

                Student temp = new Student(n, u, a, c, x, t1, t2, t3, t4);
                arr.add(temp);
                JOptionPane.showMessageDialog(null, "Student added to collection!");

            }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Please enter valid SGPA");
            }
        }
        else if (e.getSource() == complete) {
            jt.setText("");
            for (Student temp : arr) {
                jt.append(temp.toString() + "\n");
            }
        }
    }

    public static void main(String[] args) {
        StudentManagement obj = new StudentManagement();
        frm.setSize(400, 500);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frm1.setSize(500, 400);
        frm1.setVisible(true);
        frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
