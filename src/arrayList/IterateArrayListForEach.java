package arrayList;

import java.util.ArrayList;

public class IterateArrayListForEach {

  public static void main(String[] args) {
    ArrayList<String> cities = new ArrayList<>();
    cities.add("New York");
    cities.add("London");
    cities.add("Tokyo");

    System.out.println("Cities in the ArrayList:");
    for (String city : cities) {
      System.out.println(city);
    }
  }

}
