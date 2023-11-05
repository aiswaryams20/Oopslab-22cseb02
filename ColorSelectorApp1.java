/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication39;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorSelectorApp {
    private JFrame frame;
    private JTextArea textArea;
    private JRadioButton backgroundRed, backgroundGreen, backgroundBlue;
    private JRadioButton foregroundBlack, foregroundWhite, foregroundYellow;

    public ColorSelectorApp() {
        frame = new JFrame("Color Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textArea = new JTextArea(10, 30);
        JPanel textAreaPanel = new JPanel();
        textAreaPanel.add(textArea);
        frame.add(textAreaPanel, BorderLayout.CENTER);

        JPanel colorPanel = new JPanel();
        colorPanel.setLayout(new GridLayout(2, 3));

        backgroundRed = new JRadioButton("Red");
        backgroundGreen = new JRadioButton("Green");
        backgroundBlue = new JRadioButton("Blue");

        foregroundBlack = new JRadioButton("Black");
        foregroundWhite = new JRadioButton("White");
        foregroundYellow = new JRadioButton("Yellow");

        ButtonGroup backgroundGroup = new ButtonGroup();
        backgroundGroup.add(backgroundRed);
        backgroundGroup.add(backgroundGreen);
        backgroundGroup.add(backgroundBlue);

        ButtonGroup foregroundGroup = new ButtonGroup();
        foregroundGroup.add(foregroundBlack);
        foregroundGroup.add(foregroundWhite);
        foregroundGroup.add(foregroundYellow);

        colorPanel.add(backgroundRed);
        colorPanel.add(backgroundGreen);
        colorPanel.add(backgroundBlue);
        colorPanel.add(foregroundBlack);
        colorPanel.add(foregroundWhite);
        colorPanel.add(foregroundYellow);

        frame.add(colorPanel, BorderLayout.SOUTH);

        backgroundRed.addActionListener(e -> textArea.setBackground(Color.RED));
        backgroundGreen.addActionListener(e -> textArea.setBackground(Color.GREEN));
        backgroundBlue.addActionListener(e -> textArea.setBackground(Color.BLUE));
        foregroundBlack.addActionListener(e -> textArea.setForeground(Color.BLACK));
        foregroundWhite.addActionListener(e -> textArea.setForeground(Color.WHITE));
        foregroundYellow.addActionListener(e -> textArea.setForeground(Color.YELLOW));

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ColorSelectorApp();
        });
    }
}

