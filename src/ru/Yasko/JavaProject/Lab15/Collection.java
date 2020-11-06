package ru.Yasko.JavaProject.Lab15;

public class Collection {
    private int[] a = new int[0];

    public void addElement(int data){
        int[] temp = new int[a.length+1];
        for(int i=0;i<a.length;i++){
            temp[i]=a[i];
        }
        temp[a.length]=data;
        a=temp;
    }
    public void deleteElement(int ind){
        int[] temp = new int[a.length-1];
        int k=0;
        boolean found=false;
        for(int i=0;i<a.length-1;i++){
            if(i==ind){
                found=true;
            }
            if(found) {
                temp[i]=a[i+1];
            }
            else{
                temp[i]=a[i];
            }
        }
        a=temp;
    }

    public int indexSearch(int ind){
       return a[ind];
    }

    public int dataSearch(int data){
        for(int i=0;i<a.length;i++){
            if(a[i]==data){
                return i;
            }
        }
        return -1;
    }

    public int minSearch(){
        int min=0;
        boolean noMin=true;
        for(int i=0;i<a.length;i++){
            if((a[i]<min)||(noMin)){
                min=a[i];
                noMin=false;
            }
        }
        return min;
    }

    public int maxSearch(){
        int max=0;
        boolean noMax=true;
        for(int i=0;i<a.length;i++){
            if((a[i]>max)||(noMax)){
                max=a[i];
                noMax=false;
            }
        }
        return max;
    }

    public double averageCount(){
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        if(a.length!=0) {
            return sum / a.length;
        }
        else{
            System.out.println("Ошибка! Нет элементов");
            return 0;
        }
    }

    public int getLength() {
        return a.length;
    }
}
