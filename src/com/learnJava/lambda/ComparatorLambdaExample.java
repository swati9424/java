package com.learnJava.lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {

        // **prior to java 8 *//

        Comparator<Integer> comparator = new Comparator<Integer>(){

            @Override
            public int compare(final Integer o1, final Integer o2) {
                return o1.compareTo(o2); // 0 -> o1==o2
                                        // 1 --> o1 > 02
                                         //-1 --> o1<02
            }
        };
        System.out.println("result of comparator is " + comparator.compare(3,2));

        //*with lambda func// note that lambda always embraces code reusability

        Comparator<Integer> comparatorLambda = (a,b) -> a.compareTo(b);  // no need of curly braces
        System.out.println("result of comparator is " + comparatorLambda.compare(3,2));
    }
}
