import java.util.HashMap;
import java.util.Map;

/**
 * Created by derianescobar on 11/5/17.
 */
public class HashMapExample {

    static HashMap<String,Boolean> map = new HashMap<>();

    public static void main(String[] args) {


        map.put("Derian", true);
        map.put("Christian" , false);


        if(map.containsKey("Jack")){

            System.out.println("Exist");
        }

        if(map.containsValue(Boolean.FALSE)){

            System.out.println(map.containsValue(Boolean.FALSE));
        }

        for(String s : map.keySet()){

            System.out.println(3);
        }

        for(Boolean b : map.values()){

            System.out.println(4);
        }

        for(Map.Entry<String,Boolean> kv : map.entrySet()){

            String st = kv.getKey();

            Boolean boo = kv.getValue();



            System.out.println(st + ":" + boo);
        }

        map.remove("Derian");

        System.out.println(map);

    }

}
