package com.assignment.task6;

import java.util.*;

//Program to sort HashMap in java by
//keys and values?
public class Programming10 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("vinuthna",03);
        map.put("aniket",5);
        map.put("lekha",02);
        map.put("venkat",01);
        Map<String,Integer> sortedByKey = new TreeMap<>(map);
        for(Map.Entry<String,Integer> sort : sortedByKey.entrySet()){
            System.out.println(sort.getKey() + "->" + sort.getValue());

        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((e1,e2)-> e1.getValue().compareTo(e2.getValue()));
for(Map.Entry<String,Integer> ls:list){
    System.out.println(ls.getKey() + ":"+ ls.getValue());
}

    }
}
