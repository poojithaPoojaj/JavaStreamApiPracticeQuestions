package javastreams;

import java.util.ArrayList;

public class GetMinAndMax {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(-2);
        list.add(3);
        list.add(10);
        list.add(20);
        list.add(-200);
        System.out.println(list.stream().mapToInt(Integer::intValue).summaryStatistics().getMin());
        System.out.println(list.stream().mapToInt(Integer::intValue).summaryStatistics().getMax());
    }
}
