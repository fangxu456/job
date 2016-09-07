package saima;

import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/6.
 */
public class FanZhuan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        while (in.hasNext()) {
            n = in.nextInt();
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int i = 0;
        while (a[i] < a[i + 1] && (i + 1) < n) {
            i++;
        }
        if(i==(n-1)){
            System.out.println("yes");
            return;
        }
        int j = i + 1;
        while (a[j] > a[j + 1] && (j + 1) < n) {
            j++;
        }
        if(j==(n-1)){
            if(a[n-1]>a[i]){
                System.out.println("yes");
                return;
            }else {
                System.out.println("no");
                return;
            }

        }
        int k = j + 1;
        while (a[k] < a[k + 1] && k < (n - 1)) {
            k++;
        }
        if (k != (n - 1)) {
            System.out.println("no");
            return;
        }
        if(i==0&&j==(n-1)){
            System.out.println("yes");
            return;
        }
        if (a[i] < a[j] && a[i+1]<a[j+1]){
            System.out.println("yes");
            return;
        }

    }
}
