/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;

public class ShoppingManagementGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Shopping Management GUI");
        
       
        
        JLabel background = new JLabel(new ImageIcon("Background .jpg"));
        JPanel p = new JPanel();
        JLabel jl = new JLabel("                                        Shopping Management                  ");
        p.setLayout(new BorderLayout());
        Font font = new Font("Tahoma",Font.BOLD,40);
        jl.setFont(font);
        jl.setForeground(Color.DARK_GRAY);
        p.add(jl,BorderLayout.NORTH);
        p.setBackground(Color.white);
        p.add(background,BorderLayout.CENTER);
        frame.add(p);

        JMenuBar menuBar = new JMenuBar();
        JMenu homeMenu = new JMenu("Home");
        JMenu productMenu = new JMenu("Product");
        JMenu contactMenu = new JMenu("Contact");
        JMenu chatMenu = new JMenu("Chat");
        JMenu newMenu = new JMenu("Menu");

        JMenuItem loginItem = new JMenuItem("Login Page");
        JMenuItem createItem = new JMenuItem("Create New Account");

        JMenuItem productalterItem = new JMenuItem("Alter Product Details");
        JMenuItem producttableItem = new JMenuItem("Tabular Product Information");
        JMenuItem contactItem = new JMenuItem("Contact Details");
        JMenuItem chatItem = new JMenuItem("Chat With Us");
        JMenuItem menuItem = new JMenuItem("Menu App");

        homeMenu.add(loginItem);
        homeMenu.add(createItem);
        productMenu.add(productalterItem);
        productMenu.add(producttableItem);
        contactMenu.add(contactItem);
        chatMenu.add(chatItem);
        newMenu.add(menuItem);

        menuBar.add(homeMenu);
        menuBar.add(productMenu);
        menuBar.add(contactMenu);
        menuBar.add(chatMenu);
        menuBar.add(newMenu);

        frame.setJMenuBar(menuBar);

        loginItem.addActionListener((ActionEvent e)
                -> {

            LoginPage.main(null);

        });

        createItem.addActionListener((ActionEvent e) -> {
            CreateAccountGUI.main(null);

        });

        productalterItem.addActionListener((ActionEvent e) -> {
            Datamanipulation.main(null);

        });

        producttableItem.addActionListener((ActionEvent e) -> {
            ScrollableJTable.main(null);

        });

        contactItem.addActionListener((ActionEvent e) -> {

            ContactDetailsGUI.main(null);

        });

        chatItem.addActionListener((ActionEvent e) -> {
            SimpleChatBox.main(null);

        });

        menuItem.addActionListener((ActionEvent e) -> {

            Menuapp.main(null);

        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(1400, 1400);
        frame.setVisible(true);

    }
}