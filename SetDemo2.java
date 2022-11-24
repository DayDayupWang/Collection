import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        Random r = new Random();
        while (set.size() < 10) {
            int number = r.nextInt(20) + 1;
            set.add(number);
        }
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
