package ru.Yasko.JavaProject.Lab8;

public class Lab8 {
    public static void run(String[] args){
        Frame1 frame1 = new Frame1();
        if(args.length>0){
            Frame2 frame2 = new Frame2(args[0]);
        }
        Frame3 frame3 = new Frame3();
    }
}
