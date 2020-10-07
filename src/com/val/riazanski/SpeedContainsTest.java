package com.val.riazanski;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class SpeedContainsTest {
    //fields
    private static long linkContainsTime = 0;
    private static long arrayContainsTime = 0;
    private static long hashContainsTime = 0;
    private static final long anInt = 100000;
    //methods
    static void getLinkTime() {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < anInt; i++) {
            linkedList.add(i);
        }
        long s = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.contains(i);
        }
        long f = System.currentTimeMillis();
        linkContainsTime = f - s;
    }
    static void getArrayTime() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < anInt; i++) {
            arrayList.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.contains(i);
        }
        long finish = System.currentTimeMillis();
        arrayContainsTime = finish - start;
    }
    static void getHashSetTime() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < anInt; i++) {
            hashSet.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < hashSet.size(); i++) {
            hashSet.contains(i);
        }
        long finish = System.currentTimeMillis();
        hashContainsTime = finish - start;
    }
    public static void main(String[] args) {
        int nSeries = 3;
        long alinkContainsTime = 0;
        for (int i = 0; i < nSeries; i++) {
            getLinkTime();
            System.out.println(linkContainsTime);
            alinkContainsTime = alinkContainsTime + linkContainsTime;
        }
        System.out.println("среднее время удаления в LinkedList = " + alinkContainsTime / nSeries);

        long aarrayContainsTime = 0;
        for (int i = 0; i < nSeries; i++) {
            getArrayTime();
            System.out.println(arrayContainsTime);
            aarrayContainsTime = aarrayContainsTime + arrayContainsTime;
        }
        System.out.println("среднее время удаления в ArrayList = " + aarrayContainsTime / nSeries);

        long ahashContainsTime = 0;
        for (int i = 0; i < nSeries; i++) {
            getHashSetTime();
            System.out.println(hashContainsTime);
            ahashContainsTime = ahashContainsTime + hashContainsTime;
        }
        System.out.println("среднее время добавления в HashSet = " + ahashContainsTime / nSeries);

    }

}
