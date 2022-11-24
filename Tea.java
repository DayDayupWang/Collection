public class Tea implements Comparable<Tea> {
    private String name;
    private int price;

    public Tea() {
    }

    public Tea(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Tea o) {

        // return 0; 0表示没有优先，而本身已有一个值，所以不再添加
        // return -1; -1表示逆序
        // return 1; // 1表示顺序
        int num = this.price - o.price;
        int num2 = num == 0 ? this.name.compareTo(o.name) : num;
        // 这里的name.compareTo是String的compareTo接口，可以实现需要的字符串对比
        return num2;
    }

}
