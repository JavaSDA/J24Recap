package com.company.collections;

import com.company.generic.Cup;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        // SET
        // The Set interface is used for unique elements
        // (If you pass in duplicate values they will be treated as one value or element)

        // The set interface is not an ORDERED collection.
        // There is no indexing, and as such to find elements you
        // can either use the contains() method on the interface or
        // you iterate through the set using a loop.

        // HashSet - This does not maintain the
        // order in which items are added

        // TreeSet - This has a built-in comparator that orders
        // elements in ascending order.

        // LinkedHashSet - This implementation maintains the order
        // in which the items are passed in.

        Set<String> set = new LinkedHashSet<>();
        set.add("Bobby");
//        set.add("Bobby"); // duplicate is ignored
        set.add("Fred");
        set.add("James");
        set.add("Barry");

        Object[] names = set.toArray();

//        System.out.println(names[1]); // Print the second element in the array.
//
//        System.out.println(set);

        // LIST
        // This is an ordered collection
        // - Can contain duplicates
        // - Allows indexing (just like we're used to in arrays)


        // ArrayList
        // LinkedList

        List<String> list = new LinkedList<>();
        list.add("Harry"); // 0
        list.add("Lisa"); // 1
        list.add("Lisa"); // 2
        list.add("Rebecca"); // 3

        Object[] listArr = list.toArray();
//
//        System.out.println(listArr[0]);
//
//        System.out.println(list.get(1)); //



        // QUEUE
        // FIFO - First In First Out

        Queue<String> starbucksQueue = new LinkedList<>();

        // throw exceptions
        // add(E e) - Adding to back of the queue
        // remove() - removing from the front of the queue
        // element() - checking the element at the front of the queue

        // don't throw exceptions
        // offer(E e)
        // poll() - equiv to remove, but returns null instead of throwing an exception
        // peek() - equiv to element, but returns null instead of throwing an exception

//        starbucksQueue.add("David");
//        starbucksQueue.offer("Barry");
//        starbucksQueue.offer("Johnson");

//        System.out.println(starbucksQueue.peek());
//        System.out.println(starbucksQueue);

        // The Map is a data structure that allows you to store values in a key-value pair format
        // Make sure that the keys are unique as it is the searchable index of a value in a Map

        /*
        {
            // Key   Value
            "David": 15
        }
        */

        // The three main implementations for a Map in Java are
        // HashMap
        // TreeMap
        // LinkedHashMap

        Map<String, Integer> peopleAges = new LinkedHashMap<>();
//        peopleAges.putIfAbsent("David", 15);
        peopleAges.put("David", 15);
        peopleAges.put("Fred", 16);
//
//        System.out.println(peopleAges);
//        peopleAges.remove("Fred");
//        System.out.println(peopleAges);

        System.out.println(peopleAges.containsKey("Fred"));
        System.out.println(peopleAges.containsValue(10));

        System.out.println(peopleAges.values());
        System.out.println(peopleAges.keySet());
    }
}
