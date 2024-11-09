/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleChatBox {

    JLabel l1;
    JTextField problemField;
    JTextArea solutionArea;
    JFrame f1;

    public String[] predefinedProblems = {"Issue in product", "I want to add product", "I want to delete product", "I want to view product availability", "I want to create an account"};
    public String[] predefinedSolutions = {"Please Visit Contact Details", "Please Visit Product Details", "Please Visit Product Details", "Please Visit Tabular Product Information", "Please Visit Create Account Page"};

    public SimpleChatBox() {
        f1 = new JFrame();
        f1.setTitle("Simple Chat Box");
        f1.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        l1 = new JLabel("|  Chat  | ");
        Font font = new Font("TIMES NEW ROMAN", Font.BOLD, 20);
        l1.setFont(font);
        panel.add(l1, BorderLayout.LINE_START);

        solutionArea = new JTextArea();
        solutionArea.setEditable(false);
        solutionArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(solutionArea);
        scrollPane.setPreferredSize(new Dimension(600, 300));
        panel.add(scrollPane, BorderLayout.NORTH);

        problemField = new JTextField("Enter issue here ...");
        problemField.setPreferredSize(new Dimension(600, 80));
       

        panel.add(problemField, BorderLayout.SOUTH);

        JButton sendButton = new JButton("Send");
        sendButton.setPreferredSize(new Dimension(600, 50));
        panel.add(sendButton, BorderLayout.AFTER_LINE_ENDS);
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String problem = problemField.getText().trim();
                String solution = getSolutionForProblem(problem);
                solutionArea.setText(solution);
            }
        });

        f1.add(panel);
        f1.setLayout(new FlowLayout());
        f1.pack();
        f1.setVisible(true);
    }

    public String getSolutionForProblem(String problem) {
        for (int i = 0; i < predefinedProblems.length; i++) {
            if (predefinedProblems[i].equalsIgnoreCase(problem)) {
                return predefinedSolutions[i];
            }
        }
        return "Sorry, no solution found for this problem.";
    }

    public static void main(String[] args) {
        SimpleChatBox s1 = new SimpleChatBox();
    }
}
