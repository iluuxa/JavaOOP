package ru.IShorin.JavaPracticeIshorin.lab7;

public class Person {
    Furniture[] basket=new Furniture[0];
    public void putInBasket(int id){
        if(FurnitureShop.getFurniture(id)!=null) {
            Furniture[] temp=new Furniture[basket.length+1];
            for(int i=0;i< basket.length;i++){
                temp[i]=basket[i];
            }
            temp[basket.length]=FurnitureShop.getFurniture(id);
            basket = temp;
        }
    }
    public void putInBasket(String name){
        if(FurnitureShop.getFurniture(name)!=null){
            if(FurnitureShop.getFurniture(name)!=null) {
                Furniture[] temp=new Furniture[basket.length+1];
                for(int i=0;i< basket.length;i++){
                    temp[i]=basket[i];
                }
                temp[basket.length]=FurnitureShop.getFurniture(name);
                basket = temp;
            }
        }
    }
    public void show(){
        for(int i=0;i< basket.length;i++){
            System.out.println(basket[i].getName()+"  Цена: "+basket[i].getPrice()+" Материал: "+basket[i].getMaterial());
        }
    }
}
