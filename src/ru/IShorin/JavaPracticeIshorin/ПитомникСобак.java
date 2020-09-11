package ru.IShorin.JavaPracticeIshorin;

public class ПитомникСобак {
    private Dog[] dogs=new Dog[0];

    public ПитомникСобак(Dog[] dogs) {
        this.dogs = dogs;
    }

    public ПитомникСобак() {
    }

    public Dog[] getDogs() {
        return dogs;
    }

    public void setDogs(Dog[] dogs) {
        this.dogs = dogs;
    }
    public void setDog(int i,Dog dog){
        dogs[i]=dog;
    }
    public Dog getDog(int i){
        return dogs[i];
    }
    public void DisplayDogInfo(int i){
        System.out.println("Кличка: "+dogs[i].getName()+"\nВозраст: "+dogs[i].getAge()+"   В человеческих: "+dogs[i].toHumanYears()+"\n");
    }
    public void DisplayDogsInfo(){
        for(int i=0;i< dogs.length;i++){
            System.out.println("Кличка: "+dogs[i].getName()+"\nВозраст: "+dogs[i].getAge()+"   В человеческих: "+dogs[i].toHumanYears()+"\n");
        }
    }

    public void addDog(Dog dog){
        Dog[] dogs1=new Dog[dogs.length+1];
        for(int i=0;i< dogs.length;i++)
        {
            dogs1[i]=dogs[i];
        }
        dogs1[dogs.length]=dog;
        dogs=dogs1;
    }
}
