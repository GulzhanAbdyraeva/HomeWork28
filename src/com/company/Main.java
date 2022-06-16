package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
/**Integer массивден жуп сандарды терип алынызда алардын квадраттарынын эн чонун табыныз.**/
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>(List.of(34, 231, 234, 6, 43, 23, 879, 456, 2, 134));
        arrayList1.stream().filter(x -> x % 2 == 0).map(x -> x * x).max(Integer::compare).ifPresent(System.out::println);

    }
}
