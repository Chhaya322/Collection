package learncollectionframework;
import java.util.Stack;
public class Learnstack {
    public static void main(String args[]){
    Stack<String> animals=new Stack<>();
    animals.push("lion");
    animals.push("dog");
    animals.push("cat");
    //animals.push("dukkar");
    System.out.println("Stack: "+animals);
    animals.pop();
    System.out.println(animals.peek());
    
    }
    
}
