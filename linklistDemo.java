import java.util.LinkedList;

public class linklistDemo {
    public static void main(String[] args) {
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("hello ");
        lList.add("world");
        lList.add("java");
        lList.addFirst("1");
        lList.addLast("2");

        System.out.println(lList.getFirst());
        System.out.println(lList.getLast());
        System.out.println(lList);
    }
}
