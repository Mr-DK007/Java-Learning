package arrayList;

import java.util.ArrayList;

public class AddElementsToArrayList {
  public static void main(String[] args) {

    // Elements are added to the end of the internal array. The array grows dynamically if needed.
    ArrayList<String> colors = new ArrayList<>();
    colors.add("Red");
    colors.add("Green");
    colors.add("Blue");
    System.out.println("ArrayList with colors: " + colors); // Output: ArrayList with colors: [Red,
                                                            // Green, Blue]
  }
}
