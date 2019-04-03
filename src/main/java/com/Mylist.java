package com;

import java.util.Arrays;

public class Mylist<E> {
    private int size;
    private  static final int DEFAULT_CAPACITY=10;
    private   Object [] elements;

    public Mylist() {

        elements=new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapacity(){
        elements= Arrays.copyOf(elements,elements.length*2);
    }
    public void add(E e) {
       if (size==elements.length){ensureCapacity();}
        elements[size]=e;
        size++;

    }
    public E get(int index){
        if (index>= size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        return (E) elements[index];
    }


}
