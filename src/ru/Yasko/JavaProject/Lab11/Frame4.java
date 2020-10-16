package ru.Yasko.JavaProject.Lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Frame4 extends JFrame {
    JTextField jTextField = new JTextField(10);
    JButton button = new JButton(" Попробовать");
    Font font = new Font("Times new roman",Font.BOLD,20);
    int num=(int)(Math.random()*20);
    int tries = 0;
    public Frame4() {
        super("Frame4");
        setLayout(new FlowLayout());
        setSize(800,600);
        add(button);
        add(jTextField);
        add(new JLabel("Введите число"));
        jTextField.setFont(font);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int x=Integer.parseInt(jTextField.getText().trim());
                if(x>num){
                    tries++;
                    if(tries>2){
                        JOptionPane.showMessageDialog(null, "Вы не угадали. Все попытки исчерпаны. Игра окончена","Note",JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                        return;
                    }
                   JOptionPane.showMessageDialog(null, "Вы не угадали. Искомое число меньше","Note",JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    if(x<num){
                        tries++;
                        if(tries>2){
                            JOptionPane.showMessageDialog(null, "Вы не угадали. Все попытки исчерпаны. Игра окончена","Note",JOptionPane.INFORMATION_MESSAGE);
                            dispose();
                            return;
                        }
                        JOptionPane.showMessageDialog(null, "Вы не угадали. Искомое число больше","Note",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Вы угадали","Note",JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                    }
                }
            }
        });


        setVisible(true);
    }

    public void paint(Graphics graphics) {

    }
}
