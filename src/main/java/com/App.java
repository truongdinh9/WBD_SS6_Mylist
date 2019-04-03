package com;

public class App {
    public static void main(String[] args) {
        Mylist <String> arr=new Mylist<>();
        arr.add("kokoo");
        arr.add("ddddsa");
        arr.add("dododo");
        System.out.println(arr.get(1));
        Mylist <Integer> arr1=new Mylist<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        System.out.println(arr1.get(1));

    }

}
