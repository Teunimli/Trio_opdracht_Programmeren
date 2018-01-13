package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionListener implements java.awt.event.ActionListener {

    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;

    private JComboBox<String> cb;

    public ActionListener(JLabel label1, JLabel label2, JLabel label3, JLabel label4, JLabel label5, JLabel label6, JLabel label7, JLabel label8, JTextField textField1, JTextField textField2, JTextField textField3, JTextField textField4, JTextField textField5, JTextField textField6, JTextField textField7, JTextField textField8, JComboBox<String> cb) {
        this.label1 = label1;
        this.label2 = label2;
        this.label3 = label3;
        this.label4 = label4;
        this.label5 = label5;
        this.label6 = label6;
        this.label7 = label7;
        this.label8 = label8;
        this.textField1 = textField1;
        this.textField2 = textField2;
        this.textField3 = textField3;
        this.textField4 = textField4;
        this.textField5 = textField5;
        this.textField6 = textField6;
        this.textField7 = textField7;
        this.textField8 = textField8;
        this.cb = cb;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (cb.getSelectedIndex()){
            case 0: //Account
                label1.setText("Account Id:");
                label2.setText("First name:");
                label3.setText("Last name:");
                label4.setText("Street:");
                label5.setText("House number:");
                label6.setText("Annex:");
                label7.setText("Area:");
                label8.setText("Active: (0 or 1)");
                textField1.setVisible(true);
                textField2.setVisible(true);
                textField3.setVisible(true);
                textField4.setVisible(true);
                textField5.setVisible(true);
                textField6.setVisible(true);
                textField7.setVisible(true);
                textField8.setVisible(true);
                break;
            case 1: //Episode
                label1.setText("Title:");
                label2.setText("Serie Id:");
                label3.setText("Duration:");
                label4.setText("");
                label5.setText("");
                label6.setText("");
                label7.setText("");
                label8.setText("");
                textField1.setVisible(true);
                textField2.setVisible(true);
                textField3.setVisible(true);
                textField4.setVisible(false);
                textField5.setVisible(false);
                textField6.setVisible(false);
                textField7.setVisible(false);
                textField8.setVisible(false);
                break;
            case 2: //Movie
                label1.setText("Movie Id:");
                label2.setText("Title:");
                label3.setText("Duration:");
                label4.setText("Genre:");
                label5.setText("Language:");
                label6.setText("Age:");
                label7.setText("");
                label8.setText("");
                textField1.setVisible(true);
                textField2.setVisible(true);
                textField3.setVisible(true);
                textField4.setVisible(true);
                textField5.setVisible(true);
                textField6.setVisible(true);
                textField7.setVisible(false);
                textField8.setVisible(false);
                break;
            case 3: //Profile
                label1.setText("Name:");
                label2.setText("Age:");
                label3.setText("Account:");
                label4.setText("");
                label5.setText("");
                label6.setText("");
                label7.setText("");
                label8.setText("");
                textField1.setVisible(true);
                textField2.setVisible(true);
                textField3.setVisible(true);
                textField4.setVisible(false);
                textField5.setVisible(false);
                textField6.setVisible(false);
                textField7.setVisible(false);
                textField8.setVisible(false);
                    break;
            case 4: //Series
                label1.setText("Series Id:");
                label2.setText("Title:");
                label3.setText("Duration:");
                label4.setText("");
                label5.setText("");
                label6.setText("");
                label7.setText("");
                label8.setText("");
                textField1.setVisible(true);
                textField2.setVisible(true);
                textField3.setVisible(true);
                textField4.setVisible(false);
                textField5.setVisible(false);
                textField6.setVisible(false);
                textField7.setVisible(false);
                textField8.setVisible(false);
                break;
        }
    }
}
