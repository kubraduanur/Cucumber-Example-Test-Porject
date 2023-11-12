package mpapi.helpers;

public class StringHelper {
    public static String filterCustomerName(String name) {
        String filteredName = "";
        for (String part : name.trim().split(" ")) {
            if (part.length() >= 2) {
                filteredName = filteredName.concat(part.substring(0, 2) + "****");
            } else {
                filteredName = filteredName.concat(part.charAt(0) + "****");
            }
            filteredName = filteredName.concat(" ");
        }
        filteredName = filteredName.trim();
        if (filteredName.length() >= 50) {
            filteredName = filteredName.substring(0,50);
        }
        return filteredName;
    }
}
