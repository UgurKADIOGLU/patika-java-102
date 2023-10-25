package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String,String> country=new LinkedHashMap<>();
        country.put("TR","Türkiye");
        country.put("GR","Romanya");
        System.out.println(country.get("TR"));
        country.remove("TR");
        System.out.println(country.size());
        System.out.println(country.get("TR"));
        for(String key:country.keySet()){
            System.out.println(key);
        }
    }
}