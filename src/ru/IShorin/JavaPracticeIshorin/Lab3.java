package ru.IShorin.JavaPracticeIshorin;

import java.util.Scanner;

public class Lab3 {
    public static void run(){
        Scanner in=new Scanner(System.in);
        Circle circle=new Circle(12);
        CircleTester.displayInfo(circle);
        Human dummy = new Human(200,30,20,87,5,90,10,true,false,false,false,false);
        Human inv = new Human(190, 28,20,74,6,4,3,80,12,true,false,false,true,true,true,false);
        dummy.arm1.setDamaged(true);
        inv.arm1.hand1.setFingersnumber(0);
        dummy.DisplayCharacteristics();
        String author=in.nextLine();
        String title =in.nextLine();
        int year = in.nextInt();
        Book book = new Book(author,title,year);
        BookTest.displayInfo(book);
    }

    public static class Human {
        double height;
        arm arm1;
        arm arm2;
        leg leg1;
        leg leg2;
        head head1;

        public Human(double height,double headheight,double headdiameter, double armlength,double armradius, double leglength, double hipradius, boolean headdmg,boolean arm1dmg,boolean arm2dmg,boolean leg1dmg,boolean leg2dmg) {
            this.height = height;
            head1=new head(headheight,headdiameter,headdmg);
            arm1=new arm(armlength,armradius,arm1dmg);
            arm2=new arm(armlength,armradius,arm2dmg);
            leg1=new leg(leglength,hipradius,leg2dmg);
            leg2=new leg(leglength,hipradius,leg2dmg);
        }
        public Human(double height,double headheight,double headdiameter, double armlength,double armradius, int hand1fing, int hand2fing,double leglength, double hipradius, boolean headdmg,boolean arm1dmg,boolean arm2dmg, boolean hand1dmg, boolean hand2dmg,boolean leg1dmg,boolean leg2dmg) {
            this.height = height;
            head1=new head(headheight,headdiameter,headdmg);
            arm1=new arm(armlength,armradius,arm1dmg,hand1fing,hand1dmg);
            arm2=new arm(armlength,armradius,arm2dmg,hand2fing,hand2dmg);
            leg1=new leg(leglength,hipradius,leg2dmg);
            leg2=new leg(leglength,hipradius,leg2dmg);
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }
        void DisplayCharacteristics(){
            System.out.println(
                    "Head height: "+head1.getHeight()+
                            "\nHead max diameter: "+head1.getMaxdiameter()+
                            "\nArms length: "+arm1.getLength()+
                            "\nArms radius: "+arm1.getArmrradius()+
                            "\nFingers on 1 hand: "+arm1.hand1.getFingersnumber()+
                            "\nFingers on 2 hand: "+arm2.hand1.getFingersnumber()+
                            "\nLegs length: "+leg1.getLength()+
                            "\nHip radius: "+leg1.getHipradius()+
                            "\nHead damage: "+head1.isDamaged()+
                            "\nArm 1 damaged: "+arm1.isDamaged()+
                            "\nHand 1 damaged: "+arm1.hand1.isDamaged()+
                            "\nArm 2 damaged: "+arm2.isDamaged()+
                            "\nHand 2 damaged: "+arm2.hand1.isDamaged()+
                            "\nLeg 1 damaged: "+leg1.isDamaged()+
                            "\nLeg 2 damaged: "+ leg2.isDamaged()
            );
        }
        class head{
            double height;
            double maxdiameter;
            boolean damaged=false;

            public head(double height, double maxdiameter, boolean damaged) {
                this.height = height;
                this.maxdiameter = maxdiameter;
                this.damaged = damaged;
            }

            public double getHeight() {
                return height;
            }

            public void setHeight(double height) {
                this.height = height;
            }

            public double getMaxdiameter() {
                return maxdiameter;
            }

            public void setMaxdiameter(double maxdiameter) {
                this.maxdiameter = maxdiameter;
            }

            public boolean isDamaged() {
                return damaged;
            }

            public void setDamaged(boolean damaged) {
                this.damaged = damaged;
            }
        };
        class leg{
            double length;
            double hipradius;
            boolean damaged=false;

            public leg(double length, double hipradius, boolean damaged) {
                this.length = length;
                this.hipradius = hipradius;
                this.damaged = damaged;
            }

            public double getLength() {
                return length;
            }

            public void setLength(double length) {
                this.length = length;
            }

            public double getHipradius() {
                return hipradius;
            }

            public void setHipradius(double hipradius) {
                this.hipradius = hipradius;
            }

            public boolean isDamaged() {
                return damaged;
            }

            public void setDamaged(boolean damaged) {
                this.damaged = damaged;
            }
        };
        class arm{
            double length;
            double armrradius;
            boolean damaged=false;
            class hand{
                int fingersnumber=5;
                boolean damaged=false;

                public int getFingersnumber() {
                    return fingersnumber;
                }

                public void setFingersnumber(int fingersnumber) {
                    this.fingersnumber = fingersnumber;
                }

                public boolean isDamaged() {
                    return damaged;
                }

                public void setDamaged(boolean damaged) {
                    this.damaged = damaged;
                }

                public hand(int fingersnumber, boolean damaged) {
                    this.fingersnumber = fingersnumber;
                    this.damaged = damaged;
                }

                public hand() {}
            };
            hand hand1=new hand();

            public double getLength() {
                return length;
            }

            public void setLength(double length) {
                this.length = length;
            }

            public double getArmrradius() {
                return armrradius;
            }

            public void setArmrradius(double armrradius) {
                this.armrradius = armrradius;
            }

            public boolean isDamaged() {
                return damaged;
            }

            public void setDamaged(boolean damaged) {
                this.damaged = damaged;
            }

            public arm(double length, double armrradius, boolean damaged) {
                this.length = length;
                this.armrradius = armrradius;
                this.damaged = damaged;
            }

            public arm(double length, double armrradius, boolean damaged, int fingernumber, boolean handdmg) {
                this.length = length;
                this.armrradius = armrradius;
                this.damaged = damaged;
                hand1=new hand(fingernumber,handdmg);
            }
        };
    }

    public static class CircleTester {
        public static void displayInfo(Circle circle){
            System.out.println("Радиус: "+circle.getRadius()+"\nПериметр: "+circle.getPerimeter()+"\nПлощадь: "+circle.getSquare());
        }
    }

    public static class Circle{
        private double radius;
        private double square;
        private double perimeter;

        public Circle(double radius) {
            this.radius = radius;
            perimeter=2*Math.PI*radius;
            square=Math.PI*radius*radius;
        }

        public Circle(double radius, double square, double perimeter) {
            this.radius = radius;
            this.square = square;
            this.perimeter = perimeter;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getSquare() {
            return square;
        }

        public void setSquare(double square) {
            this.square = square;
        }

        public double getPerimeter() {
            return perimeter;
        }

        public void setPerimeter(double perimeter) {
            this.perimeter = perimeter;
        }
    }

    public static class BookTest {
        public static void displayInfo(Book book){
            System.out.println("\nАвтор: "+book.getAuthor()+"\nНазвание: "+book.getName()+"\nГод написания: "+book.getYear());
        }
    }

    public static class Book {
        private String author;
        private String title;
        private int year;

        public Book(String author, String name, int year) {
            this.author = author;
            this.title = name;
            this.year = year;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author)
        {
            this.author = author;
        }

        public String getName() {
            return title;
        }

        public void setName(String name) {
            this.title = name;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }
}
