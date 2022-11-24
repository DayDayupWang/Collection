import java.util.HashSet;
import java.util.Set;

public class setDemo {
    public static void main(String[] args) {
        // 不包含重复元素
        Set<String> set = new HashSet<String>();
        set.add("hello ");
        set.add("world");
        set.add("java");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("----------------------");
        // hashset ，对迭代顺序不做保证，没有带索引的方法，
        // 不能用普通for循环
        // 不包含重复元素
        HashSet<String> set2 = new HashSet<String>();
        set2.add("hello ");
        set2.add("world");
        set2.add("java");
        for (String c : set2) {
            System.out.println(c);
        }
    }
}
