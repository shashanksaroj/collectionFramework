package com.shashank.main;

import java.util.HashSet;
import java.util.Set;

public class set {



    public static void main(String[] args){


        Set<Integer> s=new HashSet<Integer>() ;

     for(int i=0;i<10;i++)
        s.add(i);




        System.out.println(s);

        s.remove(1);

        System.out.println(s);

        for(int v:s){

            System.out.print(" "+v);

        }

    }
}
