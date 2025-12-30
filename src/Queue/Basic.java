package Queue;
/*
👉 Queue ek linear data structure hai jo FIFO (First In First Out) principle follow karta
hai, jisme element rear se insert (enqueue) hote hain aur front se remove (dequeue) hote hain.
 */
import java.util.*;// follow a principle of first in first out
public class Basic{
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();// or arraydec
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);

        q.remove() ;//or q.poll();
        System.out.println(q);

        System.out.println(q.element()); // or q.peek();
        System.out.println(q.size());
    }
}
