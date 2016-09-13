package huawei;

import java.util.Scanner;

//╩ьнд

public class test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        String str = in.nextLine();
        String[] stringList = str.split("\\s");
        String max = "";
        for (String s : stringList) {
            if (getLength(s) > count) {
                count = getLength(s);
                max = s;
            }
        }
        System.out.println(max);

    }

    private static int getLength(String s) {
        StringBuffer sb = new StringBuffer(s);
        String ssb = sb.reverse().toString();
        if (s.equals(ssb)) {
            return s.length();
        } else {
            return -1;
        }
    }
}
