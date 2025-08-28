package Phase3;
import java.util.ArrayList;

public class ElementCheck {

        public static void main(String[] args) {
            // Create an ArrayList of strings
            ArrayList<String> colors = new ArrayList<>();

            // Add some elements
            colors.add("Red");
            colors.add("Green");
            colors.add("Blue");

            // Element to check
            String searchColor = "Green";

            // Use contains() to check if the element exists
            if (colors.contains(searchColor)) {
                System.out.println(searchColor + " is in the list.");
            } else {
                System.out.println(searchColor + " is NOT in the list.");
            }
        }
    }
