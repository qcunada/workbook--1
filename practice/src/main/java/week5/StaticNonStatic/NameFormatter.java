package week5.StaticNonStatic;

public class NameFormatter {
    private NameFormatter(){}
    //This is a private constructor — it stops anyone from creating an object of NameFormatter (because we only want static methods).

    public static String format(String firstName, String lastName){
        return lastName + ", " + firstName;
        //This method takes a first and last name, and returns them in "Last, First" format. It's static, so it can be called without an object.
    }
    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) { //This version of format() takes all five parts of a name. Some of them might be empty or missing.

        StringBuilder sb = new StringBuilder(); //We use StringBuilder to build the final formatted name efficiently.

        sb.append(lastName).append(",");  //Always start with the last name, followed by a comma.


        if (prefix != null && !prefix.isBlank()) {
            sb.append(" ").append(prefix);   //Only add the prefix if it's not null or empty.
        }

        sb.append(" ").append(firstName); //First name is required, so we always add it.

        if (middleName != null && !middleName.isBlank()) {
            sb.append(" ").append(middleName);  //Add the middle name only if it's not blank.
        }

        if (suffix != null && !suffix.isBlank()) {
            sb.append(", ").append(suffix);
        }

        return sb.toString().trim();
    }

    // Format from fullName string (e.g. "Dr. Mel B Johnson, PhD")
    public static String format(String fullName) {
        if (fullName == null || fullName.isBlank()) {
            return "";
        }

        // Split suffix (after comma)
        String[] suffixSplit = fullName.split(",", 2);
        String namePart = suffixSplit[0].trim();
        String suffix = (suffixSplit.length > 1) ? suffixSplit[1].trim() : "";

        // Split name part into words
        String[] parts = namePart.split(" ");
        String prefix = "", firstName = "", middleName = "", lastName = "";

        if (parts.length == 2) {
            // Mel Johnson
            firstName = parts[0];
            lastName = parts[1];
        } else if (parts.length == 3) {
            // Mel B Johnson
            firstName = parts[0];
            middleName = parts[1];
            lastName = parts[2];
        } else if (parts.length == 4) {
            // Dr. Mel B Johnson
            prefix = parts[0];
            firstName = parts[1];
            middleName = parts[2];
            lastName = parts[3];
        } else {
            return fullName; // return as-is if it doesn't match a known pattern
        }

        return format(prefix, firstName, middleName, lastName, suffix);
    }
}
