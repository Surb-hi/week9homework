package homeworkweek8;

import java.util.HashMap;
import java.util.Map;

public class Program9_HashMap {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();
        people.put("Surbhi", 1);
        people.put("Srutiben", 2);
        people.put("Kalpeshbhai", 3);
        people.put("Vrundaben", 4);
        people.put("Saurbhbhai", 5);
        people.put("Harsh", 6);
        people.put("Purviben", 7);

        for (Map.Entry<String, Integer> personname : people.entrySet()) {
            System.out.println(personname);
        }
    }
}