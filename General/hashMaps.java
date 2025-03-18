import java.util.HashMap;

public class hashMaps {
    public static void main(String[] args) {
        // Similar to Python Dictionaries
        HashMap<String, Integer> scores = new HashMap<String, Integer>();

        // scores.put("Math", 39);
        scores.put("Science", 85);
        scores.put("English", 100);
        scores.put("Chinese", 52);

        scores.putIfAbsent("Math", 70);
        scores.replace("Math", 30);
        System.out.println(scores.toString());
 
        // scores.remove("Math");
        // scores.clear();

        System.out.println(scores.toString());
        System.out.println(scores.size());
        System.out.println(scores.get("English"));
        System.out.println(scores.getOrDefault("Religion", -1));

        System.out.println(scores.containsKey("Math"));
        System.out.println(scores.containsValue(100));
        System.out.println(scores.isEmpty());

        // For Each Loop
        scores.forEach((subject, score) -> {
            System.out.println(subject + " - " + score);
            scores.replace(subject, score, score - 5);
        });

        System.out.println(scores.toString());
    }
}
