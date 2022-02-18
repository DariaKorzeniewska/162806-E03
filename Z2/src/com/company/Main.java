package com.company;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {


        LinkedHashSet<String> hash1 = new LinkedHashSet<String>();
        hash1.add("kot");
        hash1.add("pies");
        hash1.add("mrówka");
        hash1.add("krówka");

        LinkedHashSet<String> hash2 = new LinkedHashSet<String>();
        hash2.add("czerwony");
        hash2.add("zielony");
        hash2.add("niebieski");
        hash2.add("różowy");

        LinkedHashSet<String> hash3 = new LinkedHashSet<String>();
        hash3.add("pustka");
        hash3.add("nic");
        hash3.add("null");
        hash3.add("zero");


    }

    public static void usun(LinkedHashSet hash){
        int i=0;
        while(hash.iterator().hasNext()){
            if(hash.size()-1==i){
                
            }
        }
    }


}
