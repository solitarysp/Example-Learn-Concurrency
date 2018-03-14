package com.higgsup.thread.SynchronizedCollectionsConcurrentCollections.ConcurrentCollections;/*
  By Chi Can Em  15-03-2018
 */

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
    public static void main(String[] args) {
        methodFix3();
    }


    public static void methodFix() {
        ConcurrentLinkedQueue<Integer> integerList = new ConcurrentLinkedQueue<Integer>();
        for (int i = 0; i < 10; i++) {
            integerList.add(i);
        }
        System.out.println("===============");
        for (Integer integer : integerList
                ) {
            integerList.add(999);
            System.out.println();
        }
    }
    public static void methodFix2() {
        ConcurrentSkipListSet<Integer> integerList = new ConcurrentSkipListSet<Integer>();
        for (int i = 0; i < 10; i++) {
            integerList.add(i);
        }
        int a=10;
        System.out.println("===============");
        for (Integer integer : integerList
                ) {
            a+=1;
            integerList.add(a);
            System.out.println(integer);
        }
    }

    public static void methodFix3() {
        Map<String, Object> foodData = new ConcurrentHashMap<String, Object>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        foodData.put("flamingo1", 3);
        for (String key : foodData.keySet()) {
            System.out.println(key);
            foodData.remove(key);
        }
    }

    public void methodsError() {
        List<Integer> integerList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            integerList.add(i);
        }
        System.out.println("===============");
        for (Integer integer : integerList
                ) {
            integerList.add(999);
        }
    }
}
