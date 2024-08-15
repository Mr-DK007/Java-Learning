package arrayList;

import java.util.ArrayList;

public class RemoveArrayListElements {

  public static void main(String[] args) {
    ArrayList<String> animals = new ArrayList<>();
    animals.add("Lion");
    animals.add("Tiger");
    animals.add("Bear");

    // The remove() method removes the element at the specified index, and subsequent elements are
    // shifted to fill the gap.

    animals.remove(1); // Removes "Tiger" at index 1
    System.out.println("ArrayList after removal: " + animals); // Output: ArrayList after removal:
                                                               // [Lion, Bear]
  }

}
