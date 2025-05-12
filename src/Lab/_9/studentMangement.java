package Lab._9;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class studentMangement implements ActionListener {
    ArrayList<student> arr = new ArrayList<>();
    static JFrame frm;
    static JFrame frm1;
    JLabel name1, age1, addr1, usn1, category1;
    JTextField name, usn, address, age, category;
    JButton compute, done, complete;
    JTextArea jt;
    float[] sgpas = new float[4];

    public studentMangement() {
        frm = new JFrame("Student Entry Form");
        frm1 = new JFrame("Student Details");

        name1 = new JLabel("Enter Name:");
        age1 = new JLabel("Enter Age:");
        addr1 = new JLabel("Enter Address:");
        usn1 = new JLabel("Enter USN:");
        category1 = new JLabel("Enter Category:");

        name = new JTextField(20);
        age = new JTextField(20);
        address = new JTextField(20);
        usn = new JTextField(20);
        category = new JTextField(20);

        compute = new JButton("Compute CGPA");
        done = new JButton("Done");
        complete = new JButton("Show All");

        compute.addActionListener(this);
        done.addActionListener(this);
        complete.addActionListener(this);

        done.setEnabled(false); // Disabled initially

        frm.setLayout(new GridLayout(8, 2));
        frm.add(name1); frm.add(name);
        frm.add(age1); frm.add(age);
        frm.add(addr1); frm.add(address);
        frm.add(usn1); frm.add(usn);
        frm.add(category1); frm.add(category);
        frm.add(compute); frm.add(done);
        frm.add(new JLabel()); frm.add(complete);

        jt = new JTextArea(20, 40);
        jt.setEditable(false);
        frm1.add(new JScrollPane(jt));
        frm1.setSize(500, 300);
        frm1.setVisible(true);

        frm.setSize(400, 400);
        frm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == compute) {
            // Validate all input fields
            if (name.getText().trim().isEmpty() || age.getText().trim().isEmpty() ||
                    address.getText().trim().isEmpty() || usn.getText().trim().isEmpty() ||
                    category.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(frm, "Please fill all fields!", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            try {
                Integer.parseInt(age.getText().trim()); // Age check
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frm, "Age must be a number!", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Ask SGPA inputs via input dialogs
            try {
                for (int i = 0; i < 4; i++) {
                    String s = JOptionPane.showInputDialog(frm, "Enter SGPA for Semester " + (i + 1));
                    float sgpa = Float.parseFloat(s);
                    if (sgpa < 0 || sgpa > 10) throw new NumberFormatException();
                    sgpas[i] = sgpa;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frm, "Enter valid SGPA values (0-10)!", "SGPA Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            JOptionPane.showMessageDialog(frm, "CGPA computed successfully!");
            done.setEnabled(true);
            compute.setEnabled(false);
        }

        if (e.getSource() == done) {
            String nm = name.getText().trim();
            String usnText = usn.getText().trim();
            String addr = address.getText().trim();
            String cat = category.getText().trim();
            int ageVal = Integer.parseInt(age.getText().trim());

            student s = new student(nm, usnText, addr, cat, ageVal, sgpas[0], sgpas[1], sgpas[2], sgpas[3]);
            arr.add(s);
            JOptionPane.showMessageDialog(frm, "Student record added!");

            // Reset form and buttons
            name.setText(""); age.setText(""); address.setText(""); usn.setText(""); category.setText("");
            compute.setEnabled(true);
            done.setEnabled(false);
        }

        if (e.getSource() == complete) {
            StringBuilder sb = new StringBuilder();
            for (student s : arr) {
                sb.append(s.toString());
            }
            jt.setText(sb.toString());
        }
    }

    public static void main(String[] args) {
        new studentMangement();
    }
}
