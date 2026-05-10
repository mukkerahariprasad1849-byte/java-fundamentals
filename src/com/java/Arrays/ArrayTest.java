package com.java.Arrays;

public class ArrayTest {
    static void main(String[] args) {
        int[] ids = new int[5];
        ids[0] = 10;
        ids[1] = 20;
        ids[2] = 30;
        ids[3] = 40;
        ids[4] = 50;
        System.out.println(ids.length);
        System.out.println(ids[2]);

        for(int i=0;i<ids.length;i++) {
            System.out.println(ids[i]);
        }
            for(int id: ids){
                System.out.println(id);
            }
            for (int i=0;i<ids.length; i++){
                ids[i] += 10;
        }
            for (int id : ids){
                id += 10;
            }
        System.out.println("--------2------");
            for(int id : ids){
                System.out.println(id);
            }
            char[] chars = {'a','b','c','d','e'};
            for (char c : chars){
                System.out.println(c);
            }
    }

}
