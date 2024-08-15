package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayListIterator {

  public static void main(String[] args) {
    ArrayList<String> colors = new ArrayList<>();
    colors.add("Red");
    colors.add("Green");
    colors.add("Blue");

    System.out.println("Colors in the ArrayList:");

    Iterator<String> color = colors.iterator();

    while (color.hasNext()) {
      System.out.println(color.next());
    }
  }

}
