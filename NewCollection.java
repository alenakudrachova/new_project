import java.util.*;

public class NewCollection {
    public static void entrySetCollection(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ' ' + entry.getValue());
        }
    }
    public static void keySetCollection (Map<String, Integer> map) {
        for (String marvelFilms : map.keySet()) {
            System.out.println("Key: " + marvelFilms);
        }
    }
    public static void valuesCollection (Map<String, Integer> map) {
        for (Integer marks : map.values()) {
            System.out.println("Value: " + marks);
        }
    }

    public static void main(String[] args) {

        Map<String, Integer> newMap = new HashMap<>();
        newMap.put("Doctor Strange in the Multiverse of Madness", 5);
        newMap.put("Thor: Love and Thunder", 2);
        newMap.put("The Guardians of the Galaxy Holiday Special", 9);
        newMap.put("Black Panther: Wakanda Forever", 6);

        entrySetCollection(newMap);
        keySetCollection(newMap);
        valuesCollection(newMap);


        List<String> listOfNumbers = new ArrayList<>();
        listOfNumbers.add("1");
        listOfNumbers.add("2");
        listOfNumbers.add("3");
        listOfNumbers.add("4");
        listOfNumbers.add("4");
        listOfNumbers.add("5");
        listOfNumbers.add("6");

        Set<String> list = new LinkedHashSet<>(listOfNumbers);
        List<String> list2 = new ArrayList<>(list);
        System.out.println(list2);
    }
}


