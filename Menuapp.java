/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menuapp {
    JFrame jf1;
    JPanel p1;
    JMenuBar mb;
    JMenu m1, m2, m3, m4;
    JMenuItem i1, i2, i3, i4, i5, i6, i7, i8, i9;
    JTextArea textArea;

    void GUI() {
        jf1 = new JFrame("Menu App");
        p1 = new JPanel();
        mb = new JMenuBar();
        textArea = new JTextArea(50, 95);

        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        m4 = new JMenu("Full-screen view");
        i1 = new JMenuItem("New file");
        i2 = new JMenuItem("Open file");
        i3 = new JMenuItem("Cut");
        i4 = new JMenuItem("Copy");
        i5 = new JMenuItem("Paste");
        i6 = new JMenuItem("Normal view");
        i7 = new JMenuItem("Break preview");
        i8 = new JMenuItem("Enable");
        i9 = new JMenuItem("Disable");

        i1.addActionListener(e -> textArea.setText("New file created"));
        i2.addActionListener(e -> textArea.setText("File opened"));
        i3.addActionListener(e -> textArea.cut());
        i4.addActionListener(e -> textArea.copy());
        i5.addActionListener(e -> textArea.paste());
        i6.addActionListener(e -> textArea.setText("Switched to Normal view"));
        i7.addActionListener(e -> textArea.setText("Break preview enabled"));
        i8.addActionListener(e -> textArea.setText("Full-screen view enabled"));
        i9.addActionListener(e -> textArea.setText("Full-screen view disabled"));

        m1.add(i1);
        m1.add(i2);
        m2.add(i3);
        m2.add(i4);
        m2.add(i5);
        m3.add(i6);
        m3.add(i7);
        m3.add(m4);
        m4.add(i8);
        m4.add(i9);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        jf1.setJMenuBar(mb);
        jf1.setSize(500, 500);
        p1.add(new JScrollPane(textArea));
        jf1.add(p1);
        jf1.pack();
        jf1.setVisible(true);
    }

    public static void main(String[] args) {
        Menuapp j1 = new Menuapp();
        j1.GUI();
    }
}
