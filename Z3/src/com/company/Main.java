package com.company;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class Main {


    public static void main(String[] args) {
	    for(File k: katalog){
            System.out.println(k.getName());
        }
    }

    public List<File> katalog(){
        File obiekt = new File("C://Użytkownicy//Publiczne");
        return Arrays.stream(obiekt.listFiles()).filter(x-> x.isDirectory()).collect(Collectors.toList());

    }
}
