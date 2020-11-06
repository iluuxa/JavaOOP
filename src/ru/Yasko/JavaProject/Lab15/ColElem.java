package ru.Yasko.JavaProject.Lab15;

public class ColElem {
    private int data;
    private int index;
    private ColElem next;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ColElem getNext() {
        return next;
    }

    public void setNext(ColElem next) {
        this.next = next;
    }

    public ColElem(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
