package niuke;

/**
 * Created by YJSYF on 2016/9/8.
 */
public class TestDemo {
    private int count;

    public static void main(String[] args) {
        TestDemo test = new TestDemo(88);
        System.out.println(test.count);
    }

    TestDemo(int a) {
        this.count = a;
    }
}