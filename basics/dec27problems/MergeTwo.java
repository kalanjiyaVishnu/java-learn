package basics.dec27problems;

import java.util.LinkedList;
import java.util.List;

public class MergeTwo {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list2.add(1);
        list2.add(2);
        list2.add(34);
            (list1, list2);
    }

    static void merge(LinkedList l1, LinkedList l2) {
        LinkedList res =  
        int min = Math.min(l1.size(), l2.size());
        for (int i = 0; i < min; i++) {
            if(l1.indexOf(i) > l2.indexOf(i)){
                
            }
        }
        System.out.println(l1 + " " + l2);
    }
}
