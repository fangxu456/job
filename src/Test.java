
import java.util.*;

public class Test {

}

class FirstRepeat {
    public char findFirstRepeat(String A, int n) {
        List<Character> hm = new ArrayList<Character>();
        char[] c = A.toCharArray();
        char flag = ' ';
        for (int i = 0; i < n; i++) {
            if (!hm.contains(c[i])) {
                hm.add(c[i]);
            } else {
                flag = c[i];
                break;
            }
        }
        return flag;
    }
}


class A {
    public A(int a) {
    }
}

abstract class B extends A {

    public B() {
        super(2);
    }
}

abstract class C {
    public C(int a) {
    }
}

class D extends C {
    public D() {
        super(2);
    }
}
