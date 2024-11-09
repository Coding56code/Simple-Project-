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

public class Datamanipulation implements ActionListener {

    JPanel p1;
    JFrame jf1;
    JButton b1, b2, b3, b4, b5;
    JTextField t1, t2, t3;
    JLabel tl, l0, l1, l2, l3;

    Connection dbcon = null;
    Statement stmt = null;
    ResultSet rs = null;
    String query = null;

    void GUI() {
        jf1 = new JFrame("Product Details");
        
        b1 = new JButton("Previous");
        b2 = new JButton("Next");
        b3 = new JButton("Insert");
        b4 = new JButton("Update");
        b5 = new JButton("Delete");
        l1 = new JLabel("ID : ");
        l2 = new JLabel("Name : ");
        l3 = new JLabel("Quantity : ");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        tl = new JLabel("Product Details");
        l0 = new JLabel();

        Font font1 = new Font("TIMES NEW ROMAN", Font.BOLD, 20);
        Font font = new Font("TIMES NEW ROMAN", Font.PLAIN, 20);

        tl.setFont(font1);
        b1.setFont(font);
        b2.setFont(font);
        b3.setFont(font);
        b4.setFont(font);
        b5.setFont(font);
        l1.setFont(font);
        l2.setFont(font);
        l3.setFont(font);
        t1.setFont(font);
        t2.setFont(font);
        t3.setFont(font);

        p1 = new JPanel();

        p1.add(tl);
        p1.add(l0);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        GridLayout g1 = new GridLayout(7, 2, 90, 90);

        p1.setLayout(g1);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        jf1.add(p1);
        jf1.setLayout(new FlowLayout());
        jf1.setSize(500, 500);
        jf1.pack();
        jf1.setVisible(true);

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            dbcon = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "root");
            stmt = dbcon.createStatement();
            query = "select * from product";
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
        }
    }

    public static void main(String args[]) {
        Datamanipulation a1 = new Datamanipulation();
        a1.GUI();
    }

    public void actionPerformed(ActionEvent ae) {

        try {
            if (ae.getSource() == b1) {
                rs.previous();
                String id = rs.getString("pid");
                String pname = rs.getString("pname");
                String qty = rs.getString("qty");
                t1.setText(id);
                t2.setText(pname);
                t3.setText(qty);
            }
            if (ae.getSource() == b2) {
                rs.next();
                String id = rs.getString("pid");
                String pname = rs.getString("pname");
                String qty = rs.getString("qty");
                t1.setText(id);
                t2.setText(pname);
                t3.setText(qty);
            }
            if (ae.getSource() == b3) {
                stmt = dbcon.createStatement();
                query = "insert into product values('" + t1.getText() + "', '" + t2.getText() + "', " + t3.getText() + ");";
                stmt.executeUpdate(query);
            }
            if (ae.getSource() == b4) {
                stmt = dbcon.createStatement();
                query = "update product set pname='" + t2.getText() + "' , qty=" + t3.getText() + " where pid='" + t1.getText() + "';";
                stmt.executeUpdate(query);
            }
            if (ae.getSource() == b5) {
                stmt = dbcon.createStatement();
                query = "delete from product where pid='" + t1.getText() + "';";
                stmt.executeUpdate(query);
            }
        } catch (Exception e) {
            System.out.println("Sorry failed to connect to the database.." + e.getMessage());
        }
    }
}

