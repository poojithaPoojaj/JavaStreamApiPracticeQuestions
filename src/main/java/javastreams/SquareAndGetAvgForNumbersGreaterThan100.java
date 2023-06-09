package javastreams;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareAndGetAvgForNumbersGreaterThan100 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(20);

        list.add(100);

       double avg= list.stream().map(x->x*x).filter(x->x>100).mapToInt(Integer::intValue).summaryStatistics().getAverage();
        System.out.println(avg);
    }
}
