package com.hexaware.trainer;
import java.util.List;
import java.util.ArrayList;

/**
* Program to Custom Exception class.
* @author Prasanna.
*/
public class ArrayListDemo {
    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("Sougata");
        names.add("Sridharan");
        names.add("Maran");
        names.add("Arjun");
        names.add("Leela");
        System.out.println("Names are  ");
        for(Object ob : names) {
            System.out.println(ob);
        }
    }
}