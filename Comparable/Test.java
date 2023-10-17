package Comparable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(1.0);
        circles[1] = new ComparableCircle(2.0);
        circles[2] = new ComparableCircle(3.0);

        System.out.println("pre-sort");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("post-sort");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
