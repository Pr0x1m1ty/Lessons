package lesson14;

import org.testng.annotations.Test;

import java.util.*;

public class MapExamples {

    @Test
    public void mapFor() {


        Map<String, Double> map = new HashMap<>();

        map.put("StarWars1", 8.6);
        map.put("StarWars2", 9.0);
        map.put("StarWars3", 8.2);
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            String key = entry.getKey();
            Double value = entry.getValue();

            System.out.println("Movie title: " + key + " Rating: " + value);

        }
    }


    @Test
    public void listIterator(){
        List<String> sexNames = new ArrayList<>();
        sexNames.add("Slava");
        sexNames.add("Jack");
        sexNames.add("Kolya");
        sexNames.add("Pisos");

    }

}
