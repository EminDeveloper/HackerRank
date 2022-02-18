package hackerRank.days.sixth;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class A {

    public static void main(String[] args) {

        List<List<String>> nestedCollection = new ArrayList<>();

        List<String> strList1 = Arrays.asList("List 1 Str 1", "List 1 Str 2", "List 1 Str 3");

        List<String> strList2 = Arrays.asList("List 2 Str 4", "List 2 Str 5");


        nestedCollection.add(strList1);
        nestedCollection.add(strList2);

//        List<String> flattenList = new ArrayList<>();

        List<String> flattenList = nestedCollection.stream().flatMap(list -> list.stream()).collect(Collectors.toList());

        System.out.println("Flatten List with forEach() : "+flattenList);

    }
}
