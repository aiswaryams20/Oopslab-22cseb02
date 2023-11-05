/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication38;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SnowmanMover extends JFrame {
    private JPanel snowmanPanel;
    private int snowmanX = 200;
    private int snowmanY = 200;

    public SnowmanMover() {
        setTitle("Snowman Mover");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton leftButton = new JButton("Left");
        JButton rightButton = new JButton("Right");
        JButton upButton = new JButton("Up");
        JButton downButton = new JButton("Down");

        snowmanPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.WHITE);
                g.fillOval(snowmanX, snowmanY, 60, 60);
                g.fillOval(snowmanX + 10, snowmanY + 60, 40, 40);
                g.fillOval(snowmanX + 20, snowmanY + 100, 20, 20);

                g.setColor(Color.BLACK);
                g.fillOval(snowmanX + 20, snowmanY + 20, 5, 5);
                g.fillOval(snowmanX + 35, snowmanY + 20, 5, 5);

                g.drawArc(snowmanX + 22, snowmanY + 30, 15, 15, 190, 160);
            }
        };

        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                snowmanX -= 10;
                snowmanPanel.repaint();
            }
        });

        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                snowmanX += 10;
                snowmanPanel.repaint();
            }
        });

        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                snowmanY -= 10;
                snowmanPanel.repaint();
            }
        });

        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                snowmanY += 10;
                snowmanPanel.repaint();
            }
        });

        JPanel controlPanel = new JPanel();
        controlPanel.add(leftButton);
        controlPanel.add(rightButton);
        controlPanel.add(upButton);
        controlPanel.add(downButton);

        setLayout(new BorderLayout());
        add(snowmanPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SnowmanMover();
            }
        });
    }
}

