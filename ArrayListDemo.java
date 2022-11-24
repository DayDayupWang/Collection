import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        ArrayList<String> d = new ArrayList<String>();
        c.add("hello");
        c.add("world");
        c.add("java");
        d.add("hello");
        d.add("world");
        d.add("java");
        c.iterator();
        // collection c 的迭代器遍历
        Iterator<String> it = c.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-------迭代器遍历--------");
        // 1 迭代器遍历
        Iterator<String> lit = d.iterator();
        System.out.println(lit.next());
        System.out.println(lit.next());
        System.out.println(lit.next());
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }
        System.out.println("-------普通for--------");
        // 2 普通for：带索引的遍历
        for (int i = 0; i < d.size(); i++) {
            String s = d.get(i);
            System.out.println(s);
        }
        System.out.println("-------增强for--------");
        // 3 增强for：最方便的遍历方式
        for (String s : d) {
            System.out.println(s);
        }

    }

}
