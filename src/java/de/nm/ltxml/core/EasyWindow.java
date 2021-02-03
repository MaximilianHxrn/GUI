package de.nm.ltxml.core;

import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EasyWindow extends JFrame {

    private static final long serialVersionUID = 1L;
    private final JLabel label;

    public static void main(String[] args) {
        new EasyWindow();
    }

    public EasyWindow() {
        super();
        setTitle("Easy Window");
        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
        });
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        label = new JLabel("Dämliches Fenster", JLabel.CENTER);
        JButton red = new JButton("Rot");
        JButton yellow = new JButton("Gelb");
        JButton exit = new JButton("Ende");
        cp.add(label, BorderLayout.CENTER);
        cp.add(red, BorderLayout.WEST);
        cp.add(yellow, BorderLayout.EAST);
        cp.add(exit, BorderLayout.SOUTH);
        setSize(400, 100);
        setVisible(true);

        exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
            
        });

        yellow.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.YELLOW);
            }
            
        });

        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setForeground(Color.RED);
            }
        });

    }
}