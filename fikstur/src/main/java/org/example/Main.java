package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        list.add("11");
        list.add("12");
        //list.add("11");
        List<String> newlist = new ArrayList<>(list);
        if(!(list.size()%2==0)){
            list.add("Bay");
            newlist.clear();
            newlist.addAll(list);
        }
        //System.out.println(newlist);

        //int b = list.size() - 2;

        for (int i = 0; i < (list.size()) - 1; i++) {
            int sayac = 0;


                System.out.println(list.get(0) + " vs " + list.get(list.size()-1+ sayac) );
                sayac --;
            //int d=1;
            for (int c = 1; c <=(list.size() / 2)-1; c++) {
                System.out.println(list.get(c) + " vs " + list.get(list.size()-1-c));
           // d--;
            }
            System.out.println("------------------------");


            //System.out.println(list.get(list.size()-1));
            newlist.set(1, list.get(list.size()-1));

            for (int a = 2; a < list.size() ; a++) {
                newlist.set(a, list.get(a - 1));
            }


            //b++;
            list.clear();
            list.addAll(newlist);


        }
    }
}