package javastreams;

import java.util.ArrayList;

public class AverageOfNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(20);
        list.add(30);
       double avg=list.stream()
                    .mapToInt(Integer::intValue)
                    .summaryStatistics()
                    .getAverage();
        System.out.println(avg);
    }
}
