package saima;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/7.
 */
public class LuDeng {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        double d = a[0];
        for(int i=1; i<n; i++){
            if((a[i]-a[i-1])/2>d){
                d = (double) (a[i]-a[i-1])/2;
            }
        }
        if((l-a[n-1])>d){
            d = (l-a[n-1]);
        }

        System.out.printf("%.2f",d);



    }

    public static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            //待插入元素
            int temp = a[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                //将大于temp的往后移动一位
                if (a[j] > temp) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = temp;
        }
    }
}
