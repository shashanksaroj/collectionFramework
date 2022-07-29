package com.shashank.main;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class map {

    public static void main(String[] args){


        Map<Integer,Integer> m=new HashMap<>();

        for(int i=0;i<10;i++)
            m.put(i,i+5);



        m.replace(1,10);

        for(int i=0;i< m.size();i++)
            System.out.print(" "+m.get(i));

        System.out.println(" ");

        for(Map.Entry<Integer,Integer> e:m.entrySet()){
            System.out.print(" " + e.getKey());
            System.out.print(" " + e.getValue());


        }

        System.out.println(" ");
        for(Integer k:m.keySet())
            System.out.print(" "+k);

        System.out.println(" ");

        for(Integer v:m.values())
          System.out.print(" "+v);


        if(m.containsValue(5))
            System.out.println(" "+4);

    }


}
