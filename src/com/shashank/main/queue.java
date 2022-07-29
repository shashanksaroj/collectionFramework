package com.shashank.main;

import java.util.LinkedList;
import java.util.Queue;

public class queue {


    public static void main(String[] args){


        Queue<Integer> q= new LinkedList<>();


        for(int i=0;i<10;i++)
        q.add(i);

        System.out.println(q);

        q.remove(3);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.peek());






    }
}
