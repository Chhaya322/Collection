package learncollectionframework;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String args[]){
    Queue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
   pq.offer(100);
   pq.offer(22);
   pq.offer(3);
   System.out.println(pq);
   //basically it creates a min heep hence small element has the highest priority
  // pq.poll();
   //System.out.println(pq);
   System.out.println(pq.peek());
}
}
