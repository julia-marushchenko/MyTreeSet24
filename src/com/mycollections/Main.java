/**
 *  Java program to create, update, read, and delete TreeSet.
 */

package com.mycollections;

import java.util.Set;
import java.util.TreeSet;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create an instance of TreeSet.
        Set<Integer> mySet = new TreeSet();

        // Add.
        mySet.add(2);
        mySet.add(1);
        mySet.add(9);
        mySet.add(8);
        mySet.add(3);
        mySet.add(4);
        mySet.add(6);
        mySet.add(5);
        mySet.add(7);

        // Display.
        System.out.println(mySet); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]

        // Delete.
        mySet.remove(9);

        // Display.
        System.out.println(mySet); // Output: [1, 2, 3, 4, 5, 6, 7, 8]

        // Update.
        mySet.add(0);

        // Display.
        System.out.println(mySet); // Output: [0, 1, 2, 3, 4, 5, 6, 7, 8]

        // Clear.
        mySet.clear();

    }
}