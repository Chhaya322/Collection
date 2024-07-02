package learncollectionframework;
import java.util.ArrayDeque;
public class LearnArrayDeque {
    public static void main(String args[]){
    ArrayDeque  <Integer> adq =new ArrayDeque<>();
    //insert element at last
    adq.offer(23);
    //insert element at first position
    adq.offerFirst(45);
    //offerlast insert element at last position same as offer.
    adq.offerLast(87);
    System.out.println(adq);
    adq.offer(55);
    System.out.println(adq);
    }
}
