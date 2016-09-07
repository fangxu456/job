package niuke;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 今日头条
 */

public class BiggestMapping {
    static class Element {
        long w;
        boolean flag;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n;
            Element[] es = new Element[10];
            for (int i = 0; i < 10; i++) {
                es[i] = new Element();
            }
            n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                String str = scan.next();
                calWeight(es, str);
            }
            System.out.println(sovle(es));
        }
        scan.close();
    }

    private static long sovle(Element[] es) {
        long res = 0;
        Arrays.sort(es, new Comparator<Element>() {
            @Override
            public int compare(Element e1, Element e2) {
                return e1.w > e2.w ? 1 : (e1.w == e2.w ? 0 : -1);
            }
        });
        if (es[0].flag) {
            int i;
            for (i = 1; i < 10; i++) {
                if (!es[i].flag) {
                    break;
                }
            }
            Element temp = es[i];
            for (; i > 0; i--) {
                es[i] = es[i - 1];
            }
            es[0] = temp;
        }
        for (int i = 9; i >= 0; i--) {
            res += es[i].w * i;
        }
        return res;
    }

    private static void calWeight(Element[] es, String str) {
        int len = str.length();
        long base = 1;
        for (int i = len - 1; i >= 0; i--, base *= 10) {
            int index = str.charAt(i) - 'A';
            es[index].w += base;
            if (i == 0) {
                es[index].flag = true;
            }
        }
    }
}

