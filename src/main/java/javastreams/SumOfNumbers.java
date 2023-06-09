package javastreams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class SumOfNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.stream().reduce(0,(c,e)->c+e));
    }
}
