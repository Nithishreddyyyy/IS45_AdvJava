package GUI;
import javax.swing.*;
import java.awt.event.*;
//Create a GUI with a button label “ Click Me”. Each time its called increment a counter and display the total number of clicks in a label
public class _1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(null);

        JButton b1 = new JButton("Click Me");
        b1.setBounds(10, 10, 100, 30);
        frame.add(b1);

        b1.addActionListener(new ActionListener() {
            int i=0;
            public void actionPerformed(ActionEvent e) {
                i++;
                System.out.println(i);
            }
        });

        // Frame settings
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
