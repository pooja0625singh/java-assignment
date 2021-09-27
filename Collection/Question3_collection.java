import java.util.*;

public class Question3_collection {
public static void main(String[] args) {
    List<String> list = Arrays.asList(" Pooja      ", "  Kumari      ", "    Singh ");
    listTrim(list);
    for (String str : list) {
        System.out.format("\"%s\"%n", str);
    }
}
    static void listTrim(List<String> strings) {
        for (ListIterator<String> list1 = strings.listIterator(); list1.hasNext(); ) {
            list1.set(list1.next().trim());
        }
    }
}