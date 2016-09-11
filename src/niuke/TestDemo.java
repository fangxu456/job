package niuke;

/**
 * Created by YJSYF on 2016/9/8.
 */
public class TestDemo {
    private int count;

    public static void main(String[] args) {
        int i=1228;
        int k=0;
        char[]ch={'a','b'};

        Integer j = new Integer(1228);
        System.out.println(i==j);
        System.out.println(j.equals(i));
        System.out.println(ch);


        TestDemo test = new TestDemo(88);
        System.out.println(test.count);
    }

    TestDemo(int a) {
        this.count = a;
    }
    protected void finalize(){
        System.out.println("finalize~~~");
    }

}