package com.company;
import java.util.LinkedList;
import java.lang.Integer;
import java.time.LocalDate;



import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> lista1 = new LinkedList<Integer>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        System.out.println(lista1);

        redukuj(lista1,1);
        System.out.println(lista1);

        LinkedList<LocalDate> lista2 = new LinkedList<LocalDate>();
        lista2.add(0,LocalDate.of(21,12,31));
        lista2.add(1,LocalDate.of(22,1,1));
        lista2.add(2,LocalDate.of(19,4,12));
        System.out.println(lista2);

        //redukuj(lista2, 0);
        System.out.println(lista2);
    }

    public static void redukuj(LinkedList lista, Integer n){
        lista.remove(lista.indexOf(n+1));
    }
}
