package learncollectionframework;
import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {
    public static void main(String args[]){
    
   ArrayList<String> snames=new ArrayList<>();
   
   snames.add("chhaya");
   snames.add("maya");
   snames.add("nandu");
   snames.add("namu");
   snames.add("chittu");
   snames.add("bhaiya");
   snames.add("mavshi");
  
  /*System.out.println(snames.get(1)) ;
  System.out.println(snames.get(2)) ;
  System.out.println(snames.get(3)) ;
  snames.add(0,"rekha");
  System.out.println(snames.get(0)) ;
  ArrayList<String> newlist=new ArrayList<>();
  newlist.add("suraj");
  newlist.add("dhiraj");
  snames.addAll(newlist);/
  System.out.println(snames.get(0));
  System.out.println(snames);
  snames.set(2,"mina");
 System.out.println( snames.contains("madhuritai"));*/
  System.out.println(snames);
  for(int i=0;i<snames.size();i++){
  System.out.println(snames.get(i));
  }
  for(String j:snames){
  System.out.println("foreach j is"+" "+ j);
  }
  Iterator<String> it=snames.iterator();
  while(it.hasNext()){
  System.out.println("iterator" + " "+it.next());}
        
    }
    }
    

