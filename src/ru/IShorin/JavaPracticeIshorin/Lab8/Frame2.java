package ru.IShorin.JavaPracticeIshorin.Lab8;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Frame2 extends Frame {
    String path;
        public Frame2(String path) {
            super("Frame2");
            this.path=path;
            setLayout(new FlowLayout());
            setSize(800, 600);
            setVisible(true);
        }
        public void paint(Graphics graphics){
            try{
                Image image= ImageIO.read(new File(path));
                graphics.drawImage(image,0,0,null);
            }
                catch(Exception e) {
                    e.printStackTrace();
                }
        }
}
