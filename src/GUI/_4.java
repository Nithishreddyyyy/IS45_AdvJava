package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonActionCommandDemo extends JFrame implements ActionListener {

    private JButton helloButton;
    private JButton byeButton;
    private JLabel resultLabel;

    public ButtonActionCommandDemo() {
        // Frame settings
        setTitle("ActionCommand Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Initialize components
        helloButton = new JButton("Say Hello");
        byeButton = new JButton("Say Bye");
        resultLabel = new JLabel("Click a button!");

        // Set Action Commands (optional - by default it's the button text)
        helloButton.setActionCommand("HELLO");
        byeButton.setActionCommand("BYE");

        // Add ActionListeners
        helloButton.addActionListener(this);
        byeButton.addActionListener(this);

        // Add components to frame
        add(helloButton);
        add(byeButton);
        add(resultLabel);

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();  // Gets the command string
        if (command.equals("HELLO")) {
            resultLabel.setText("Hello there!");
        } else if (command.equals("BYE")) {
            resultLabel.setText("Goodbye!");
        }
    }

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new ButtonActionCommandDemo());
    }
}

