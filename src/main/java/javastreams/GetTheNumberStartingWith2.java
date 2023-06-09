package javastreams;

import java.util.ArrayList;

public class GetTheNumberStartingWith2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(-2);
        list.add(3);
        list.add(10);
        list.add(20);
        list.add(-200);

        list.stream().filter(x->x.toString().startsWith("2")||x.toString().startsWith("-2")).forEach(n-> System.out.println(n));
    }
}
