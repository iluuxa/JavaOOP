package ru.IShorin.JavaPracticeIshorin;

public class FurnitureShop {
    static Furniture table1 = new Table(1000,0,"Wooden Table");
    static Furniture table2 = new Table(1500,1,"Big Wooden Table");
    static Furniture chair = new Chair(500,2,"Plastic Chair");
    static Furniture shelf = new Shelf(700,3,"Metal Shelf");
    static Furniture[] catalogue=new Furniture[]{table1,table2,chair,shelf};



    public static Furniture getFurniture(int id){
        for(int i=0;i<catalogue.length;i++){
            if(catalogue[i].getId()==id){
                return catalogue[i];
            }
        }
        return null;
    }
    public static Furniture getFurniture(String name){
        for(int i=0;i<catalogue.length;i++){
            if(catalogue[i].getName().equals(name)){
                return catalogue[i];
            }
        }
        return null;
    }
}
