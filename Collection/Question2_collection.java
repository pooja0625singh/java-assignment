import java.io.*;
import java.util.*;

public class Question2_collection {

    static final Comparator<String> IGNORE_CASE_ORDER = new Comparator<String>() {
    public int compare(String s1, String s2) {
        return s1.compareToIgnoreCase(s2);
    }
};
public static void main(String[] args) {

    List<String> list = Arrays.asList("India", "Korea", "Japan", "USA", "Thailand", "usa", "kOREA", "india");
    System.out.println("Element before sorted and removing duplicates: " + list);
    SortedSet<String> e = new TreeSet<String>(IGNORE_CASE_ORDER);    
    for (String str : list) {
           e.add(str);
    }

    System.out.println("Element after sorted and removing duplicates: " + e);
}

}