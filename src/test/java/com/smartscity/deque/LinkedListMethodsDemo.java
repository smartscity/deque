package com.smartscity.deque;

import java.util.LinkedList;

public class LinkedListMethodsDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.push("first");
        linkedList.push("second");
        linkedList.push("second");
        linkedList.push("third");
        linkedList.push("four");
        linkedList.push("five");
        System.out.println("linkedList: " + linkedList);

        System.out.println("peek: " + linkedList.peek());
        System.out.println("peekFirst: " + linkedList.peekFirst());
        System.out.println("peekLast: " + linkedList.peekLast());

        System.out.println("linkedList: " + linkedList);
    }
}