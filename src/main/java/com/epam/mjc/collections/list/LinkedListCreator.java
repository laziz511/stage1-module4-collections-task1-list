package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer number : sourceList) {
            if (number % 2 == 1) {
                linkedList.addFirst(number);
            } else {
                linkedList.addLast(number);
            }
        }
        return linkedList;
    }
}
