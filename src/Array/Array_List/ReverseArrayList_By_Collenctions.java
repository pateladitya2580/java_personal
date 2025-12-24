package Array.Array_List;

import java.util.ArrayList;
import java.util.Collections;
public class ReverseArrayList_By_Collenctions {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original List "+ list);
        Collections.reverse(list);
        System.out.println("Reversed List "+ list);
        Collections.sort(list);
        System.out.println("Ascending order " + list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Desc order " + list);
    }
}
