import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
// import java.util.Collection;

public class listDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("world");
        list.add("java");
        Iterator<String> it = list.iterator();
        // public Iterator<E> iterator() {
        // return new Itr();
        // }
        // private class Itr implements Iterator<E> {

        while (it.hasNext()) {// 使用常用迭代器
            System.out.println(it.next());
        }
        ListIterator<String> lit = list.listIterator();
        // 使用特有的list迭代器从前往后
        System.out.println("----------------");
        while (lit.hasNext()) {
            String s = lit.next();
            System.out.println(s);
        }
        // 使用特有的list迭代器从后往前
        System.out.println("----------------");
        while (lit.hasPrevious()) {
            String s = lit.previous();
            System.out.println(s);
        }
    }

}
