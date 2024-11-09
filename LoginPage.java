/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project;

import javax.swing.*; //JComponents
import java.awt.*; //layouts, events
import java.awt.event.*; //layouts, events
import java.sql.*;

public class LoginPage implements ActionListener {

    JPanel p1;
    JFrame jf1;
    JButton b1, b2;
    JTextField tuser, tpass;
    JLabel titleLabel, tl, l1, l2;

    Connection dbcon = null;
    Statement stmt = null;
    ResultSet rs = null;
    String query = null;

    void GUI() {
        jf1 = new JFrame("Login Page");

        titleLabel = new JLabel("Enter Your Login Credentials :");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 32));
        tl = new JLabel();

        b1 = new JButton("Login");
        b2 = new JButton("Cancel");

        l1 = new JLabel("Username :");
        l2 = new JLabel("Password :");
        tuser = new JTextField(20);
        tpass = new JTextField(20);

        p1 = new JPanel();

        Font font = new Font("Arial", Font.PLAIN, 32);
        l1.setFont(font);
        l2.setFont(font);
        tuser.setFont(font);
        tpass.setFont(font);
        b1.setFont(font);
        b2.setFont(font);

        p1.add(titleLabel);
        p1.add(tl);
        p1.add(l1);
        p1.add(tuser);
        p1.add(l2);
        p1.add(tpass);
        p1.add(b1);
        p1.add(b2);
        GridLayout g1 = new GridLayout(4, 2, 30, 30);

        p1.setLayout(g1);

        b1.addActionListener(this);
        b2.addActionListener(this);

        jf1.add(p1);
        jf1.setLayout(new FlowLayout());
        jf1.setSize(500, 500);
        jf1.pack();
        jf1.setVisible(true);
       

    }

    public static void main(String[] args) {
        // TODO code application logic here
        LoginPage t = new LoginPage();
        t.GUI();
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                dbcon = DriverManager.getConnection("jdbc:mysql://localhost/customer", "root", "root");
                stmt = dbcon.createStatement();
                query = "select * from login where username='" + tuser.getText() + "'";
                rs = stmt.executeQuery(query);
                while (rs.next()) {
                    String user = rs.getString("username");
                    String pass = rs.getString("password");
                    if (user.equals(tuser.getText()) && pass.equals(tpass.getText())) {
                        JOptionPane.showMessageDialog(p1, "Login successful");
                    }
                }
            } catch (Exception e) {
            }
        }
        if (ae.getSource() == b2) {
            tuser.setText("");
            tpass.setText("");
        }
    }
}
