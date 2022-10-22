import java.util.HashMap;
import java.util.Map;

public class Dictionary{
    public static void main(String[] args) {
        // English to Spanish dictionary
        Map<String, String> englSpanDictionary = new HashMap<String, String>();
        // Putting things inside our dictionary
        englSpanDictionary.put("Monday", "Lunes");
        englSpanDictionary.put("Tuesday", "Martes");
        englSpanDictionary.put("Wednesday", "Miercoles");
        englSpanDictionary.put("Thursday", "Jueves");
        englSpanDictionary.put("Friday", "Viernes");
        // Retrieve things from our dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));

        System.out.println(englSpanDictionary.keySet());
        System.out.println(englSpanDictionary.values());
        System.out.println(englSpanDictionary.size());

        englSpanDictionary.put("Saturday", "Sabado");
        englSpanDictionary.put("Sunday", "Domingo");

        System.out.println();
        System.out.println();

        // shopping list

        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();

        shoppingList.put("Bread", true);
        shoppingList.put("Ham", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Sugar", false);

        // Retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Oreos"));

        // Print key-value pairs
        System.out.println(shoppingList.toString());

        // Remove elements
        shoppingList.remove("Eggs");
        System.out.println(shoppingList.toString());

        // Replace values for a certain key
        shoppingList.replace("Bread", Boolean.FALSE);
        System.out.println(shoppingList.toString());

        // Clear out dictionary
        shoppingList.clear();// sets pointer to empty dictionary
        System.out.println(shoppingList.toString());

        System.out.println(shoppingList.isEmpty());

    }
}
