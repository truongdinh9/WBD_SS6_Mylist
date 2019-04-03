package com;

public class App {
    public static void main(String[] args) {
        Mylist <String> stringMylist=new Mylist<>();
        stringMylist.add("kokoo");
        stringMylist.add("ddddsa");
        stringMylist.add("dododo");
        System.out.println(stringMylist.get(1));
        Mylist <Integer> integerMylist=new Mylist<>();
        integerMylist.add(1);
        integerMylist.add(2);
        integerMylist.add(3);
        System.out.println(integerMylist.get(1));

    }

}
