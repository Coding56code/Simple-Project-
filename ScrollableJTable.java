/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class ScrollableJTable {
    public static void main(String[] args) {
        new ScrollableJTable();
    }

    public ScrollableJTable() {
        JFrame frame = new JFrame("Fruit Details Table");
        JPanel panel = new JPanel();
        String data[][] = {
            {"1", "Apple", "10", "100", "Fresh", "Yes", "Limited"},
            {"2", "Banana", "20", "100", "Fresh", "Yes", "Limited"},
            {"3", "Orange", "30", "100", "Fresh", "Yes", "Limited"},
            {"4", "Mango", "40", "100", "Fresh", "Yes", "Limited"},
            {"5", "Pineapple", "50", "100", "Fresh", "Yes", "Limited"},
            {"6", "Grapes", "60", "100", "Fresh", "Yes", "Limited"},
            {"7", "Watermelon", "70", "100", "Fresh", "Yes", "Limited"},
            {"8", "Strawberry", "80", "100", "Fresh", "Yes", "Limited"},
            {"9", "Peach", "90", "100", "Fresh", "Yes", "Limited"},
            {"10", "Cherry", "100", "100", "Fresh", "Yes", "Limited"},
            {"11", "Dragonfruit", "10", "100", "Fresh", "Yes", "Limited"},
            {"12", "Kiwi", "20", "100", "Fresh", "Yes", "Limited"},
            {"13", "Pear", "30", "100", "Fresh", "Yes", "Limited"},
            {"14", "Papaya", "40", "100", "Fresh", "Yes", "Limited"},
            {"15", "Plum", "50", "100", "Fresh", "Yes", "Limited"},
            {"16", "Jackfruit", "60", "100", "Fresh", "Yes", "Limited"},
            {"17", "Jamun", "70", "100", "Fresh", "Yes", "Limited"},
            {"18", "Olive", "80", "100", "Fresh", "Yes", "Limited"},
            {"19", "Melon", "90", "100", "Fresh", "Yes", "Limited"},
            {"20", "Avocado", "100", "100", "Fresh", "Yes", "Limited"},
            {"21", "Pomegranate", "50", "100", "Fresh", "Yes", "Limited"},
            {"22", "Damson", "60", "100", "Fresh", "Yes", "Limited"},
            {"23", "Durian", "70", "100", "Fresh", "Yes", "Limited"},
            {"24", "Rasberry", "80", "100", "Fresh", "Yes", "Limited"},
            {"25", "Red Currant", "90", "100", "Fresh", "Yes", "Limited"},
            {"26", "Lychee", "100", "100", "Fresh", "Yes", "Limited"},
            {"27", "Fig", "10", "100", "Fresh", "Yes", "Limited"},
            {"28", "Shaddock", "20", "100", "Fresh", "Yes", "Limited"},
            {"29", "Gooseberry", "30", "100", "Fresh", "Yes", "Limited"},
            {"30", "Cranberry", "40", "100", "Fresh", "Yes", "Limited"},
        };

        String col[] = {"ID", "Name", "Quantity", "Price per kg", "Description", "Availability", "Stock"};

        JTable table = new JTable(data, col);
        table.setFont(new Font("Arial",Font.PLAIN, 14));
        table.setPreferredScrollableViewportSize(new Dimension(500, 450));

        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("Arial",Font.BOLD, 16));

        header.setBackground(Color.yellow);
        JScrollPane pane = new JScrollPane(table);

        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        panel.add(pane);
        frame.add(panel);
        frame.setSize(600, 600); 
        frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
        frame.setVisible(true);
    }
}
