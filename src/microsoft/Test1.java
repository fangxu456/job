package microsoft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by YJSYF on 2016/10/10.
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < N; i++) {
            if(in.nextInt()%2==1){
                cnt1++;
            }else {
                cnt2++;
            }
        }
        System.out.println(Math.abs(cnt1-cnt2));

    }
}
