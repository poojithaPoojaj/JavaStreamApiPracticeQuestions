package javastreams;

import java.util.ArrayList;

public class SegregateEvenAndOddNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(-2);
        list.add(3);
        list.add(10);
        list.add(20);
        list.add(-200);

        System.out.println("Even Numbers");
        list.stream().filter(x->x%2==0).forEach(n-> System.out.print(n+" "));

        System.out.println("\nOdd Numbers");
        list.stream().filter(x->x%2!=0).forEach(n-> System.out.print(n+" "));
    }
}
