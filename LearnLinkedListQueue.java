package learncollectionframework;
import java.util.LinkedList;
import java.util.Queue;
public class LearnLinkedListQueue {
    public static void main(String args[]){
    Queue <Integer> queue =new LinkedList<>();
    //offer method is used to insert elements or add() throw exception
    queue.offer(12);
    queue.offer(1);
    queue.offer(3);
    System.out.println(queue);
    //poll() is used to delete the element in the queue or remove() thorw exception
    System.out.println(queue.poll());
    //peek fuction tells the next element or element()thorw exception
    System.out.println(queue.peek());
    }
}
