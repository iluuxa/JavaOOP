package ru.Yasko.JavaProject.lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlanetGUI extends JFrame {
    public PlanetGUI() {
        super("PlanetGUI");
        setLayout(new FlowLayout());
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        for(Planet i: Planet.values()){
            Button x=new Button(i.name());
            add(x);
            x.addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            JOptionPane.showMessageDialog(null, "Гравитация на поверхности "+i.name()+": "+i.getGravity()+" м/с^2","Note",JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
            );
            setVisible(true);
        }

    }

    public void paint(Graphics graphics) {

    }
}
