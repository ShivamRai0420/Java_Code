import java.util.*;
public class Deque_Framework {
    public static void main(String args[]){
        Deque<Integer> dq=new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        System.out.println(dq);
        dq.addLast(9);
        dq.removeFirst();
        System.out.println(dq);
        System.out.println("first elm= "+dq.getFirst());
        System.out.println("last elm= "+dq.getLast());

    }
}
