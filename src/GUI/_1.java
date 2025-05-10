package GUI;
import javax.swing.*;
import java.awt.event.*;
//Create a GUI with a button label “ Click Me”. Each time its called increment a counter and display the total number of clicks in a label
/*
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
*/
import javax.swing.*;
import java.awt.event.*;

class ClickCounterGUI {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Click Counter");
        frame.setLayout(null);

        // Label to display count
        JLabel countLabel = new JLabel("Clicks: 0");
        countLabel.setBounds(150, 50, 100, 30);
        frame.add(countLabel);

        // Button to click
        JButton clickButton = new JButton("Click Me");
        clickButton.setBounds(150, 100, 100, 40);
        frame.add(clickButton);

        // Counter
        final int[] counter = {0};

        // Event handling for button
        clickButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter[0]++;
                countLabel.setText("Clicks: " + counter[0]);
            }
        });

        // Frame settings
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
