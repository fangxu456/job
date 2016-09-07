package huawei;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/6.
 */
public class FaMa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        int count = 0;
        for(int i=0; i<n;i++){
            int sum = 0;
            for(int j=0;j<b[i];j++){
                sum+=a[i]*j;
            }
        }

        int count1=0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < a.length; i++) {
            if(!list.contains(a[i])) {
                count1++;
            }
        }
        System.out.print(count);

    }

}
