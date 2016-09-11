package niuke;

/**
 * Created by YJSYF on 2016/9/9.
 */
public class TestClass {
    private static void testMethod() {
        System.out.println("testMethod");
    }

    public static void main(String[] args) {

        TestClass t = new TestClass();
        t.testMethod();
        TestClass tt = (TestClass) null;
        tt.testMethod();
        ((TestClass) null).testMethod();
    }
}