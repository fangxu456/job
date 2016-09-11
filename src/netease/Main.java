package netease;

import java.util.Scanner;

/**
 * Created by FangXu on 2016/9/11.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i = fun(N);
        if (f(i) - N >= (N - f(i - 1))) {
            System.out.println(f(i) - N);
        } else
            System.out.println(N - f(i));
        //System.out.println(((f(fun(N))-N)>(N-f(fun(N)-1))?(f(fun(N))-N):(N-f(fun(N)-1)));

    }

    public static int fun(int N) {
        int j = 0;
        for (int i = 0; i < N && f(i) < N; i++) {
            j = i;
        }
        return j;
    }

    public static int f(int i) {
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else
            return f(i - 1) + f(i - 2);
    }
}
