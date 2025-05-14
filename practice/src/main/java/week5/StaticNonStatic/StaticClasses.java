package week5.StaticNonStatic;

public class StaticClasses {
    public static void main(String[] args) {
        System.out.println(NameFormatter.format("Quincy","Cunada"));
        // Output: Johnson, Mel

        // Test 2: Full components
        System.out.println(NameFormatter.format("Dr.", "Quincy", "", "Cunada", "PhD"));
        // Output: Johnson, Dr. Mel B, PhD

        // Test 3: Missing some optional parts
        System.out.println(NameFormatter.format("", "Mel", "B", "Johnson", ""));
        // Output: Johnson, Mel B

        // Test 4: Using full name string input
        System.out.println(NameFormatter.format("Dr. Mel B Johnson, PhD"));
        // Output: Johnson, Dr. Mel B, PhD

        System.out.println(NameFormatter.format("Mel B Johnson, Jr"));
        // Output: Johnson, Mel B, Jr

        System.out.println(NameFormatter.format("Mel Johnson"));
        // Output: Johnson, Mel
    }
}


