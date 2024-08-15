package arrayList;

import java.util.ArrayList;

public class ModifyArrayListElements {

  public static void main(String[] args) {

    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");

    // The set() method replaces the element at the specified index in the internal array.

    fruits.set(1, "Grape");
    System.out.println("Modified ArrayList: " + fruits); // Output: Modified ArrayList: [Apple,
                                                         // Grape, Orange]

  }
}
