package ru.IShorin.JavaPracticeIshorin.Lab8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Frame1 extends JFrame {
    JButton button = new JButton(" Add shape");
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    public Frame1() {
        super("Frame8");
        setLayout(new FlowLayout());
        setSize(800,600);
        add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });


        setVisible(true);
    }

    public void paint(Graphics graphics) {
        Scanner in = new Scanner(System.in);
        int f, x, y, a, w, r, h, s, b;
        Rectangle rectangle;
        Circle circle;
        f = (int) (Math.random() * 3);
        while (f == 3) {
            f = (int) (Math.random() * 3);
        }
        x = (int) (Math.random() * 800);
        y = (int) (Math.random() * 600);
        h = (int) (Math.random() * 360);
        s = (int) (Math.random() * 100);
        b = (int) (Math.random() * 100);
        switch (f) {
            case 0:
                a = (int) (Math.random() * 200);
                rectangle = new Rectangle(h, s, b, x, y, a, a);
                graphics.setColor(Color.getHSBColor(rectangle.getColor()[0], rectangle.getColor()[1], rectangle.getColor()[2]));
                graphics.drawRect(rectangle.getX(), rectangle.getY(), (int) rectangle.getSideA(), (int) rectangle.getSideB());
                break;
            case 1:
                a = (int) (Math.random() * 200);
                w = (int) (Math.random() * 150);
                rectangle = new Rectangle(h, s, b, x, y, a, w);
                graphics.setColor(Color.getHSBColor(rectangle.getColor()[0], rectangle.getColor()[1], rectangle.getColor()[2]));
                graphics.drawRect(rectangle.getX(), rectangle.getY(), (int) rectangle.getSideA(), (int) rectangle.getSideB());
                break;
            case 2:
                r = (int) (Math.random() * 150);
                circle = new Circle(h, s, b, x, y, r);
                graphics.setColor(Color.getHSBColor(circle.getColor()[0], circle.getColor()[1], circle.getColor()[2]));
                graphics.drawOval(circle.getX(), circle.getY(), (int) (circle.getRadius() * 2), (int) (circle.getRadius() * 2));
                break;
        }
    }
}
