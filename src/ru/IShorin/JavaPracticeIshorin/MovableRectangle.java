package ru.IShorin.JavaPracticeIshorin;

public class MovableRectangle extends Rectangle implements Movable{
    int x;
    int y;
    int speedx;
    int speedy;
    MovablePoint p1;
    MovablePoint p2;

    public MovableRectangle(double sidea, double sideb, int x, int y, int speedx, int speedy) {
        super(sidea, sideb);
        this.x = x;
        this.y = y;
        this.speedx = speedx;
        this.speedy = speedy;
        p1=new MovablePoint(x,y,speedx,speedy);
        p2=new MovablePoint(x+(int)(sidea),y+(int)(sideb),speedx,speedy);
    }

    public boolean isPointSpeedCorrect(){
        if((p1.getSpeedx()==p2.getSpeedx())&&(p1.getSpeedy()==p2.getSpeedy())){return true;}
        else {return false;}
    }
    public void displayPosition(){
        System.out.println("Прямоугольник находится по координатам x: "+x+"    y: "+y+"\n"
                +"Точка 1 находится по координатам x: "+p1.getX()+"    y: "+p1.getY()+"\n"
                +"Точка 2 находится по координатам x: "+p2.getX()+"    y: "+p2.getY()+"\n"
        );
    }

    public int getSpeedx() {
        return speedx;
    }

    public void setSpeedx(int speedx) {
        this.speedx = speedx;
        p1.setSpeedx(speedx);
        p2.setSpeedx(speedx);
    }

    public int getSpeedy() {
        return speedy;
    }

    public void setSpeedy(int speedy) {
        this.speedy = speedy;
        p1.setSpeedy(speedy);
        p2.setSpeedy(speedy);
    }

    @Override
    public void moveUp() {
        y++;
        p1.moveUp();
        p2.moveUp();
    }

    @Override
    public void moveDown() {
        y--;
        p1.moveDown();
        p2.moveDown();
    }

    @Override
    public void moveLeft() {
        x--;
        p1.moveLeft();
        p2.moveLeft();
    }

    @Override
    public void moveRight() {
        x++;
        p1.moveRight();
        p2.moveRight();
    }
    @Override
    public void move() {
        if(isPointSpeedCorrect()){
        y+=speedy;
        x+=speedx;
        p1.move();
        p2.move();
        }
        else {System.out.println("\nРАЗНАЯ СКОРОСТЬ ТОЧЕК\n");}
    }

    public static class MovablePoint implements Movable{
        int x;
        int y;
        int speedx;
        int speedy;

        public MovablePoint(int x, int y, int speedx, int speedy) {
            this.x = x;
            this.y = y;
            this.speedx = speedx;
            this.speedy = speedy;
        }

        public int getSpeedx() {
            return speedx;
        }

        public void setSpeedx(int speedx) {
            this.speedx = speedx;
        }

        public int getSpeedy() {
            return speedy;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void setSpeedy(int speedy) {
            this.speedy = speedy;
        }

        @Override
        public void moveUp() {
            y++;
        }

        @Override
        public void moveDown() {
            y--;
        }

        @Override
        public void moveLeft() {
            x--;
        }

        @Override
        public void moveRight() {
            x++;
        }

        @Override
        public void move() {
            y+=speedy;
            x+=speedx;
        }
    }
}
