package StringHandling;

public class StringHandlingExample {
    public static void main(String[] args) {
        // String operations
        System.out.println("=== String Operations ===");
        String str = "  Hello, Java!  ";

        // Basic String methods
        System.out.println("Original String: '" + str + "'");
        System.out.println("Length: " + str.length());
        System.out.println("Trimmed: '" + str.trim() + "'");
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring (7-11): " + str.substring(7, 11)); // Extracts "Java"
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Starts with 'Hello': " + str.trim().startsWith("Hello"));
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // String splitting
        String[] words = str.trim().split(",\\s*"); // Split by comma and optional spaces
        System.out.println("Split result: ");
        for (String word : words) {
            System.out.println(word);
        }

        // String concatenation
        String str2 = str.trim().concat(" Welcome!");
        System.out.println("Concatenated: " + str2);

        // String comparison
        String str3 = "Hello, Java!";
        System.out.println("Equals str3: " + str.trim().equals(str3));
        System.out.println("Same reference as str3: " + (str.trim() == str3)); // String pool check

        // StringBuilder operations
        System.out.println("\n=== StringBuilder Operations ===");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Append text
        System.out.println("After append: " + sb);
        sb.insert(5, ","); // Insert comma after "Hello"
        System.out.println("After insert: " + sb);
        sb.delete(5, 6); // Remove comma
        System.out.println("After delete: " + sb);
        sb.reverse(); // Reverse the string
        System.out.println("After reverse: " + sb);
        sb.reverse(); // Reverse back
        System.out.println("Converted to String: " + sb.toString());

        // StringBuffer (similar to StringBuilder but thread-safe)
        System.out.println("\n=== StringBuffer Operations ===");
        StringBuffer sbf = new StringBuffer("Java");
        sbf.append(" Programming");
        System.out.println("After append: " + sbf);
        sbf.setCharAt(0, 'j'); // Change first character
        System.out.println("After setCharAt: " + sbf);
    }
}