package com.zxedu.java;


import java.util.ArrayList;

public class Helloworld {

    //prsf psfi psfs
    private static final String STR = "";



    public static void main(String[] args) {
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("Helloworld.main");
        System.out.println("true = " + true);
        System.out.println("true = " + true);
        System.out.println("true = " + true);
        System.out.println("true = " + true);
        System.out.println("true = " + true);




        String arr[] = new String[]{"A0","A1","A2"};
        //fori
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }
        //iter
        for (String s : arr) {
            System.out.println(s);
        }

        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }

        ArrayList<String> list = new ArrayList<String>();
        //list.for
        for (String s : list) {
            
        }
        
        //list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        //ifn
        if (list == null) {

        }

        //ifnn
        if (list != null) {

        }

        //xxx.nn/xxx.null
        if (list == null) {

        }

        if (list != null) {

        }

    }


}

class MothodTest {

    private String str2;

    public MothodTest() {
    }

    @Override
    public String toString() {
        return "MothodTest{}";
    }

    public void test2(String str, int i) {

        try {
            System.out.println();
            System.out.println();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
