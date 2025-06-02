package Lab._12;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Representative extends JFrame implements ActionListener {
    JTextField repno , repname,state,comm , rate,cust_no ,cust_name,cred,repno1,repname1,state1,comm1,rate1;
    JButton submit, disp;
    ResultSet rs ;
    Connection con ;
    PreparedStatement ps, ps1;
    Statement st;

    Representative(){
        super("Enter details");
        JLabel r = new JLabel("Enter repno");
        repno = new JTextField(20);
        repname = new JTextField(20);
        state = new JTextField(20);
        comm = new JTextField();
        rate = new JTextField(20);
        cust_no = new JTextField(20);
        cust_name = new JTextField(20);
        cred = new JTextField(20);
        JLabel r1 = new JLabel("Enter Rename:");
        JLabel r2 = new JLabel("Enter State:");
        JLabel r3 = new JLabel("Enter Comment:");
        JLabel r4 = new JLabel("Enter Rate:");
        JLabel r5 = new JLabel("Enter Cust No:");
        JLabel r6 = new JLabel("Enter Cust Name:");
        JLabel r7 = new JLabel("Enter Repno:");
        submit = new JButton("Submit");
        disp = new JButton("Disp");
        add(r);
        add(repno);
        add(r1);
        add(repname);
        add(r2);
        add(state);
        add(r3);
        add(comm);
        add(r4);
        add(rate);
        add (r5);
        add(cust_no);
        add(r6);
        add(cust_name);
        add(r7);
        add(cred);
        add(submit);
        add(disp);
        submit.addActionListener(this);
        disp.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){

    }
}
