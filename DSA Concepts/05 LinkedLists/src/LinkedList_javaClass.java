import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedList_javaClass {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.push("Jinesh");

        linkedList.peek();
        int i = linkedList.size();
        System.out.println(i);

        Queue<Integer> ques = new PriorityQueue<>();
    }
}
