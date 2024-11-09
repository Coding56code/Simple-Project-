/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class CreateAccountGUI extends JFrame implements ActionListener {
    JFrame jf;
    JLabel titleLabel, nameLabel, emailLabel, passwordLabel, confirmPasswordLabel;
    JTextField nameField, emailField;
    JPasswordField passwordField, confirmPasswordField;
    JButton createButton, clearButton;
    JCheckBox agreementCheckBox;
    JPanel p;

    public CreateAccountGUI() {
        titleLabel = new JLabel("Create Account");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));

        nameLabel = new JLabel("Name :");
        nameField = new JTextField(20);

        emailLabel = new JLabel("Email :");
        emailField = new JTextField(20);

        passwordLabel = new JLabel("Password :");
        passwordField = new JPasswordField(20);

        confirmPasswordLabel = new JLabel("Confirm Password :");
        confirmPasswordField = new JPasswordField(20);

        agreementCheckBox = new JCheckBox("I agree to the terms and conditions",true);

        createButton = new JButton("Create");
        createButton.addActionListener(this);

        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);

        Font font=new Font("Arial",Font.PLAIN,26);
 
        nameLabel.setFont(font); 
        emailLabel.setFont(font); 
        passwordLabel.setFont(font); 
        confirmPasswordLabel.setFont(font);
        nameField.setFont(font);
        emailField.setFont(font);
        createButton.setFont(font); 
        clearButton.setFont(font);
        
        p = new JPanel();
        p.setLayout(new GridLayout(8, 2, 10, 10)); 

        p.add(titleLabel);
        p.add(new JLabel()); 

        p.add(nameLabel);
        p.add(nameField);

        p.add(emailLabel);
        p.add(emailField);

        p.add(passwordLabel);
        p.add(passwordField);

        p.add(confirmPasswordLabel);
        p.add(confirmPasswordField);

        p.add(new JLabel()); 
        p.add(agreementCheckBox);

        p.add(createButton);
        p.add(clearButton);

        jf = new JFrame();
        jf.setLayout(new FlowLayout());
        jf.add(p);
        jf.setTitle("Create Account");
        jf.setSize(400, 400);
        jf.pack();
        jf.setVisible(true);
    }

public void actionPerformed(ActionEvent e) {
    if (e.getSource() == createButton) {
        // Check if all fields are filled
        if (nameField.getText().isEmpty() ||
            emailField.getText().isEmpty() ||
            passwordField.getPassword().length == 0 ||
            confirmPasswordField.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "All fields must be filled.");
        } 
        
        else if (!agreementCheckBox.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please agree to the terms and conditions.");
        }
        // Check if passwords match
        else if (!Arrays.equals(passwordField.getPassword(), confirmPasswordField.getPassword())) {
            JOptionPane.showMessageDialog(this, "Passwords do not match. Please make sure they are the same.");
        } 
        else 
        {
           JOptionPane.showMessageDialog(this, "Account created successfully!");
        }
    } else if (e.getSource() == clearButton) {
        clearFields();
    }
}

    public void clearFields() {
        nameField.setText("");
        emailField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
        agreementCheckBox.setSelected(false);
    }

    public static void main(String[] args) {
        CreateAccountGUI obj = new CreateAccountGUI();
    }
}
