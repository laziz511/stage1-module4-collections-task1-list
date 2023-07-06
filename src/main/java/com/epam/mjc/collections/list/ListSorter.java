package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int result = calculateFunctionValue(a) - calculateFunctionValue(b);
        if (result == 0) {
            return a.compareTo(b);
        }
        return result;
    }

    private int calculateFunctionValue(String number) {
        int x = Integer.parseInt(number);
        return 5 * x * x + 3;
    }
}
