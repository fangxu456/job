package huawei;

import java.util.Scanner;

//ĞÄÓĞÁéÏ¬

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        String sn = in.nextLine();
        int n = Integer.parseInt(sn);

        String str = in.nextLine();
        String[] numList = str.split("\\s");
        int[] a = new int[numList.length];
        for (int i = 0; i < numList.length; i++) {
            a[i] = Integer.parseInt(numList[i]);
        }

        if (a.length == 2 * n) {
            for (int i = 0; i < 2 * n; i++) {
                for (int j = 0; j < 2 * n; j++) {
                    System.out.println(getASC(i, a));
                    System.out.println(getDESC(j, a));
                    System.out.println("----");
                    if (getASC(i, a) == getDESC(j, a)) {
                        count++;
                    }
                }
            }

        } else {
            count = -1;
        }
        System.out.println(count);
    }

    private static int getASC(int i, int[] a) {
        int sum = 0;

        for (int j = i; j >= 0; j--) {
            sum += a[j];
        }

        return sum;
    }

    private static int getDESC(int i, int[] a) {
        int sum = 0;

        for (int j = i; j < a.length; j++) {
            sum += a[j];
        }

        return sum;
    }

}
