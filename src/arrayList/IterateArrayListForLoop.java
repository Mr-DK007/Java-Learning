package arrayList;

import java.util.ArrayList;
import java.util.List;

public class IterateArrayListForLoop {

  public static void main(String[] args) {

    List<String> names = new ArrayList<String>();

    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");

    System.out.println("Names in the ArrayList:");

    for (int i = 0; i < names.size(); i++) {
      System.out.println(names.get(i));
    }

  }

}
