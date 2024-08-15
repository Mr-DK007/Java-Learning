package arrayList;

import java.util.ArrayList;

public class AccessArrayListElements {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    // The get() method directly accesses the element at the specified index in the internal array.
    // This is a fast operation.
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);

    System.out.println("Element at index 1: " + numbers.get(1)); // Output: Element at index 1: 20
  }
}
