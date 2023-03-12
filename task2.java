import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        Map <Integer,Integer> m=new HashMap<>();
        m.put(1, 10);
        m.put(2,20);

        Iterator <Integer> i=m.keySet().iterator();
        while(i.hasNext()){
            int key=i.next();
            System.out.println("key "+key);
            System.out.println("value "+m.get(key));
        }
    }
}
