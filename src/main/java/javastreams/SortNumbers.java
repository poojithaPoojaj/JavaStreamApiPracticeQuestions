package javastreams;

import java.util.ArrayList;
import java.util.Comparator;

public class SortNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(-2);
        list.add(3);
        list.add(10);
        list.add(20);
        list.add(-200);

        System.out.println("Ascending Order");
        list.stream().sorted().forEach(n-> System.out.print(n+" "));
        System.out.println("\nDescending Order");
        list.stream().sorted(Comparator.reverseOrder()).forEach(n-> System.out.print(n+" "));
    }
}
