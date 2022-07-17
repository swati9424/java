package com.learnJava.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsCopy {
    public static void main(String[] args) {

        List<String> destination_items = new ArrayList<>();
        Collections.addAll(destination_items,"pencil","pen","eraser");

        System.out.println("The original list of elements are:");

        for(int i = 0; i < destination_items.size(); i++){
            System.out.println(destination_items.get(i) + "");
        }

        List<String> source_items = new ArrayList<>();
        Collections.addAll(source_items,"sky","birds","plane");

        Collections.copy(destination_items,source_items);

        System.out.println("the list after copying is as :");

        for (int i = 0; i < destination_items.size(); i++){
            System.out.println(destination_items.get(i) + "");
        }
    }
}
