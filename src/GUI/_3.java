package GUI;
import javax.swing.*;
import java.awt.event.*;

public class _3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(null);

        JTextField tf = new JTextField();
        tf.setBounds(10, 10, 100, 30);
        frame.add(tf);

        // Use JToggleButton instead of JButton
        JToggleButton toggleBtn = new JToggleButton("Toggle");
        toggleBtn.setBounds(10, 50, 100, 30);
        frame.add(toggleBtn);

        // Add ActionListener to JToggleButton
        toggleBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (toggleBtn.isSelected()) {
                    tf.setText("On");
                } else {
                    tf.setText("Off");
                }
            }
        });

        // Frame settings
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
