package toutiao;

import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/28.
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        String str = String.valueOf(n);
        long p = (long)Math.pow(str.length(),2)-1;
        int a = (int) (m/p)+1;
        Integer b = (int) (m%p-1);
        String sss = Integer.toBinaryString(b);
        StringBuffer sb = new StringBuffer();
        sb.append(a);
        sb.append(sss);
        String res = sb.toString();
        System.out.println(res);
    }
}
