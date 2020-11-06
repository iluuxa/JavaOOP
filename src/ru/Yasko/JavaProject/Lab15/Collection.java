package ru.Yasko.JavaProject.Lab15;

public class Collection {
    private ColElem first;
    private int length=0;

    public void addElement(int data){
        length++;
        if(first!=null){
            ColElem temp=first;
            while(temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(new ColElem(data));
            temp.getNext().setIndex(length-1);
        }
        else{
            first = new ColElem(data);
            first.setIndex(0);
        }
    }
    public void deleteElement(int ind){
        ColElem temp=first;
        boolean deleted=false;
        if(ind==0){
            first=first.getNext();
            temp=first;
            length--;
            for (int i=0; i < length; i++) {
                temp.setIndex(temp.getIndex()-1);
                temp=temp.getNext();
            }
        }
        else {
            for (int i=0; i < length; i++) {
                //System.out.println(temp.getIndex()+"   "+temp.getData());
                if(deleted){
                    temp.setIndex(temp.getIndex()-1);
                }
                if (i == ind - 1) {
                    temp.setNext(temp.getNext().getNext());
                    deleted=true;
                    length--;
                }
                temp=temp.getNext();
            }
        }
    }

    public ColElem indexSearch(int ind){
        ColElem temp = first;
        for(int i=0;i<length;i++){
            if(i==ind){
                return temp;
            }
            temp=temp.getNext();
        }
        return null;
    }

    public ColElem dataSearch(int data){
        ColElem temp = first;
        for(int i=0;i<length;i++){
            if(temp.getData()==data){
                return temp;
            }
            temp=temp.getNext();
        }
        return null;
    }

    public ColElem minSearch(){
        boolean noMin=true;
        int min=0;
        ColElem temp = first;
        for (int i=0;i<length;i++){
            if((temp.getData()<min)||(noMin)){
                min=temp.getData();
                noMin=false;
            }
            temp=temp.getNext();
        }
        if (!noMin){
            return dataSearch(min);
        }
        else{
            return null;
        }
    }

    public ColElem maxSearch(){
        boolean noMax=true;
        int max=0;
        ColElem temp = first;
        for (int i=0;i<length;i++){
            if((temp.getData()>max)||(noMax)){
                max=temp.getData();
                noMax=false;
            }
            temp=temp.getNext();
        }
        if (!noMax){
            return dataSearch(max);
        }
        else{
            return null;
        }
    }

    public double averageCount(){
        ColElem temp = first;
        double sum=0;
        if(length>0) {
            for (int i = 0; i < length; i++) {
                sum += temp.getData();
                temp = temp.getNext();
            }
            return (sum / length);
        }
        else{
            System.out.println("Ошибка! В коллекции нет элементов");
            return 0;
        }
    }

    public int getLength() {
        return length;
    }
}
