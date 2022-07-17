package com.learnJava.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSearch {
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();


        //adding individual items with add()
        items.add("banana");
        items.add("apple");
        items.add("kiwi");

        //adding more than one item with addAll()

        Collections.addAll(items,"jackfruit","lemon","orange");

        //sorting the arraylist

        Collections.sort(items);

        for(int i =0; i < items.size(); i++){
            System.out.println(items.get(i) + "");
        }
        System.out.println("in reverse order");

        //sorting in reverse order
        Collections.sort(items,Collections.reverseOrder());

        for(int i =0; i < items.size(); i++){
            System.out.println(items.get(i) + "");
        }
        ///binary search on the list

        System.out.println("the index of lemon is" + Collections.binarySearch(items,"lemon"));


    }
}
