package com.shashank.main;

import java.util.ArrayList;
import java.util.Comparator;

public class arrayList { public static void main(String [] args) {
    ArrayList<Integer> la = new ArrayList<>();
    int l=la.size();

    int min = 200;
    int max = 400;
    int b = (int)(Math.random()*(max-min+1)+min);
    for (int i = 0; i < 10; i++) {

        la.add((int) (i+10+b));

    }


    la.add(0,6);
    la.set(0,100);
    System.out.print("natural order");
    for (int i = 0; i < 10; i++) {


        System.out.print( " "+la.get(i));

    }
    System.out.println("");
    System.out.println("");
    la.sort(Comparator.reverseOrder());


    System.out.print("reverse order");
    for (int i = 0; i < 10; i++) {


        System.out.print( " "+la.get(i));

    }

}

}
