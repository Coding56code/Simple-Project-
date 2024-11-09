/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project;

import javax.swing.*;
import java.awt.*;

public class ContactDetailsGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Contact Details");

        JPanel panel = new JPanel();

        JLabel titleLabel, l0, l1, l2, l3, l4, l5, l6, l7, l8;

        titleLabel = new JLabel("Contact Details of our Shopping Management");

        l0 = new JLabel();
        l1 = new JLabel("Address :");
        l2 = new JLabel("123 Main Street, Mumbai, India");
        l3 = new JLabel("Email :");
        l4 = new JLabel("shopping@shopms.com");
        l5 = new JLabel("Branch :");
        l6 = new JLabel("Sakinaka, " + "Andheri, " + "Kurla, " + "Delhi, " + "Kerala");
        l7 = new JLabel("Customer Service Number :");
        l8 = new JLabel("+1 234 567 XXX");

        Font f0 = new Font("TIMES NEW ROMAN", Font.BOLD, 32);
        Font f1 = new Font("ARIAL", Font.PLAIN, 32);
        Font f2 = new Font("ARIAL", Font.BOLD, 32);

        titleLabel.setFont(f0);

        l1.setFont(f2);
        l3.setFont(f2);
        l5.setFont(f2);
        l7.setFont(f2);

        l2.setFont(f1);
        l4.setFont(f1);
        l6.setFont(f1);
        l8.setFont(f1);

        panel.setLayout(new GridLayout(6, 2, 50, 50));
        panel.add(titleLabel);
        panel.add(l0);
        panel.add(l1);
        panel.add(l2);
        panel.add(l3);
        panel.add(l4);
        panel.add(l5);
        panel.add(l6);
        panel.add(l7);
        panel.add(l8);

        frame.add(panel);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());
        frame.pack();
        frame.setVisible(true);
    }
}
