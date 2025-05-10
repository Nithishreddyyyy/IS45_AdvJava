package GUI;
import javax.swing.*;
import java.awt.event.*;
//Create a form with a Jtextfield and a JButton when the button is clicked display the text “Entered in the console”
public class _2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        String Name = "Nithish";
        JTextField tf = new JTextField();
        tf.setBounds(10, 10, 100, 20);
        frame.add(tf);
        JButton btn = new JButton("CLICK");
        frame.add(btn);
        btn.setBounds(10, 50, 100, 20);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText(Name);
            }
        });
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
