
// import java.util.Iterator;
import java.util.List;
// import java.util.ListIterator;
import java.util.ArrayList;

public class forDemo {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i : arr) {
            System.out.println(i);

        }
        System.out.println("--------------");
        String[] strArray = { "hello", "world", "java" };
        for (String s : strArray) {
            System.out.println(s);
        }
        System.out.println("--------------");
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        // list.add("world");
        list.add("java");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------------");
        for (int i = 0; i < strArray.length; i++) {

        }
    }
}
