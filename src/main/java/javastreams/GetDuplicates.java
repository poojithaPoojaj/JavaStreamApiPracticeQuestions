package javastreams;

import java.util.ArrayList;
import java.util.HashSet;

public class GetDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(20);
        list.add(-2);
        list.add(3);
        list.add(10);
        list.add(20);
        list.add(-200);
        HashSet<Integer> set=new HashSet<>();
        list.stream().filter(x->!set.add(x)).forEach(x-> System.out.print(x));

    }
}
