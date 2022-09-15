package homework;

import java.util.LinkedList;
import java.util.Queue;

public class _933 {

    Queue<Integer> queue = new LinkedList<>();

    public _933() {

    }

    public int ping(int t) {
        queue.add(t);

        while (!queue.isEmpty() && t - queue.peek() > 3000) {
            queue.poll();
        }
        return queue.size();
    }

    public static void main(String[] args) {


    }
}
