/*
LinkedList class is collection of many objects of the same type, just like
the ArrayList.

The Linkedlist class has all of the same methods as the ArrayList class, they both
implement the List interface.Ex. add items, change items, remove items and clear the list in the same process.

ArrayList vs LinkedList

ArrayList works
-> The ArrayList class has a regular array inside to add an elements, data items are placed into the array.
-> If the array is not big enough, a new , larger array is created to replace the old one and the old one is removed.

LinkedList works
-> The LinkedList stores its items in "containers." The list has a link to the first container and each conatiner has a link to the next
container in the list.
-> To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.

When to use what

when to use on real time scenarios, An ArrayList is for storing and accessing data, and LinkedList to manipulate data.

*/

import java.util.LinkedList;
public class LinkedList_program {
    public static void main(String[] args) {
        LinkedList<String> countries= new LinkedList<String>();
        countries.add("India");
        countries.add("UAE");
        countries.add("Nepal");
        countries.add("Japan");
        countries.add("Russia");

        System.out.println(countries);
        countries.addFirst("Canada");
        System.out.println(countries);
        countries.addLast("Brazil");
        System.out.println(countries);

        countries.removeFirst();// remove an item from first
        System.out.println(countries);

        countries.removeLast();// remove an item at last
        System.out.println(countries);

        System.out.println(countries.getFirst());// method to get the first element of the linked list
        System.out.println(countries.getLast());// method to get the last element of the linked list

    }
}
