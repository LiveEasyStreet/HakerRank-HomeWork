package HW_23_02_14_Comparator.Java_Sort.wongyoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class 비교테스트 {

    public static void main(String[] args){

        List<Double> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add(1.1);
        list.add(1.2);

        System.out.println(list.toString());

        Collections.sort(list, new Comparator<Double>() {

            @Override
            public int compare(Double o1, Double o2) {
                return Double.compare(list.get(0), list.get(1));
            }
        });

        System.out.println(list.toString());

        list2.add("a");
        list2.add("b");

        System.out.println(list2.toString());

        Collections.sort(list2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return list2.get(0).compareTo(list2.get(1));
            }
        });

        System.out.println(list2.toString());
    }
}

// Double 에서는 compare
// String 에서는 compareTo

// compare( 비교대상 , 비교기준 ) return Double.compare(비교대상 , 비교기준 ) => 오름차순
//                             return 1.compareTo(2) => 내림차순  
