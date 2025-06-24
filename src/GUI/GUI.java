package GUI;

import javax.swing.*;
import java.awt.*;
public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        JLabel label = new JLabel("HELLO");
        JButton btn = new JButton("Hello");
        btn.setBounds(100, 100, 100, 50);
        btn.addActionListener(e-> System.out.println("Booked"));

        JToggleButton Btn1 = new JToggleButton("Toggle");
        Btn1.setBounds(100,100,100,30);
        frame.add(Btn1);
        Btn1.addActionListener(e->{
            if(Btn1.isSelected()){
                System.out.println("Toggle");
            }else{
                System.out.println("unToggle");
            }
        });


        frame.add(btn);
        frame.add(label);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
