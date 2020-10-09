package ru.IShorin.JavaPracticeIshorin.Lab8;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.net.URL;

public class Frame3 extends Frame {
    int i = 0;
    int j = 0;

    public Frame3() {
        super("Frame3");
        setLayout(new FlowLayout());
        setSize(800, 600);
        setVisible(true);
        while (true) {
            for (i=0; i < 2; i++) {
                for (j=0; j < 4; j++) {
                    try{
                    Thread.sleep(100);}
                    catch (Exception e){e.printStackTrace();}
                    repaint();
                }
            }
        }
    }

    public void paint(Graphics graphics) {
        try {
            Image image = ImageIO.read(new File("C://Users/Saint/IdeaProjects/JavaOOP/images.jpg"));
            graphics.drawImage(image, 100, 100, 200, 200, j * 69, i * 72, 69 + j * 69, 72 + i * 72, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
