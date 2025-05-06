package Test;

import javax.swing.*;
import java.awt.event.*;

class GFG {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GFG Example");
        frame.setLayout(null);

        // JTextField
        JTextField textField = new JTextField();
        textField.setBounds(150, 50, 220, 30);
        frame.add(textField);

        // JButton
        JButton button = new JButton("Don't worry");
        button.setBounds(150, 100, 220, 40);
        frame.add(button);

        // JLabel for message
        JLabel label = new JLabel("");
        label.setBounds(150, 150, 220, 30);
        frame.add(label);

        // Show message on button click
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("GFG WEB Site Click");
            }
        });

        // JRadioButton
        JRadioButton radioButton = new JRadioButton("A");
        radioButton.setBounds(150, 200, 220, 30);
        frame.add(radioButton);

        // JComboBox
        String[] items = { "Option 1", "Option 2", "Option 3" };
        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.setBounds(150, 250, 220, 30);
        frame.add(comboBox);

        // JTextArea in JScrollPane
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(150, 300, 220, 100);
        frame.add(scrollPane);

        // Frame settings
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
