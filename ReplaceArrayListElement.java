import java.util.ArrayList;
import java.util.List;

public class ReplaceArrayListElement {

    public static void main(String[] args) {
       
        List<String> myList = new ArrayList<>();

       
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");
        myList.add("Date");

        System.out.println("Original ArrayList: " + myList);

        
        String newElement = "Grape";
        int indexToReplace = 1;

        if (indexToReplace >= 0 && indexToReplace < myList.size()) {
            myList.set(indexToReplace, newElement);
            System.out.println("ArrayList after replacement: " + myList);
        } else {
            System.out.println("Invalid index. The list has " + myList.size() + " elements (indices 0 to " + (myList.size()-1) + ")");
        }


        
        indexToReplace = 5;
        if (indexToReplace >= 0 && indexToReplace < myList.size()) {
            myList.set(indexToReplace, newElement);
            System.out.println("ArrayList after replacement: " + myList);
        } else {
            System.out.println("Invalid index. The list has " + myList.size() + " elements (indices 0 to " + (myList.size()-1) + ")");
        }
    }
}