package gui;

import javax.swing.*;
import java.awt.*;

public class InlogInterface implements Runnable {

    private JFrame frame;

    public void run() {
        frame = new JFrame("Netflix Inlog");
        frame.setPreferredSize(new Dimension(800, 500));
        frame.getContentPane().setLayout(null);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        JPanel panelTab1 = new JPanel();
        BorderLayout layout = new BorderLayout();
        panelTab1.setLayout(layout);
        panelTab1.setBackground(Color.white);

        JLabel nameText = new JLabel("Account name: ");
        JTextField nameField = new JTextField();
        JLabel passwordText = new JLabel("Password: ");
        JTextField passwordField = new JTextField();
        JButton loginBtn = new JButton("Log in");
        JButton registerBtn = new JButton("Register");

        nameText.setBounds(150,80,150,25);
        nameField.setBounds(400,80,150,25);
        passwordText.setBounds(150,160,150,25);
        passwordField.setBounds(400,160,150,25);
        registerBtn.setBounds(150, 400, 150, 50);
        loginBtn.setBounds(500, 400, 150, 50);

        InlogActionListener inlogActionListener = new InlogActionListener(nameField, passwordField);
        loginBtn.addActionListener(inlogActionListener);

        RegisterActionListener registerActionListener = new RegisterActionListener();
        registerBtn.addActionListener(registerActionListener);

        container.add(nameText);
        container.add(nameField);
        container.add(passwordText);
        container.add(passwordField);
        container.add(loginBtn);
        container.add(registerBtn);
    }

    public JFrame getFrame() {
        return frame;
    }

}
