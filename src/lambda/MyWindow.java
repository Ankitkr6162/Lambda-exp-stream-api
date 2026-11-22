package lambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyWindow {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Click me");
        button.addActionListener((ActionEvent e) -> {
            System.out.println("Button clicked");
            JOptionPane.showMessageDialog(null,"Hey there button is clicked");
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(button);
    }
}
