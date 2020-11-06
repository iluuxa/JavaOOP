package ru.Yasko.JavaProject.Lab16;

public class Queue{
    private int[] a=new int[0];
    private int length=0;

    public void add(int x){
        int[] temp = new int[length+1];
        for(int i=0;i<length;i++){
            temp[i]=a[i];
        }
        temp[length]= x;
        a=temp;
        length++;
    }

    public int peek(){
        return a[0];
    }

    public int take(){
        int[] temp=new int[length-1];
        for(int i=1;i<length;i++){
            temp[i-1]=a[i];
        }
        int res=a[0];
        a=temp;
        length--;
        return res;
    }

    public int getLength() {
        return length;
    }
}
