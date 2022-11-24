import java.util.TreeSet;;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Tea> c = new TreeSet<Tea>();
        Tea t1 = new Tea("puer", 10);
        Tea t2 = new Tea("longjing", 25);
        Tea t3 = new Tea("tieguanyin", 20);

        c.add(t1);
        c.add(t2);
        c.add(t3);
        for (Tea tea : c) {
            System.out.println(tea.getName() + "," + tea.getPrice());
        }
        Generic<Boolean> g3 = new Generic<Boolean>();
        g3.setT(true);
        System.out.println(g3.getT());
        fanxing f1 = new fanxing();
        f1.show("heipi");
        f1.show(30);
        f1.show(true);
        f1.show(12.34);
    }
}
