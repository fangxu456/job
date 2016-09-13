package netease;

import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/13.
 * 回文字符串最少次数
 */
public class Test3 {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int N = in.nextInt();
            int[] a = new int[N];
            for(int i = 0; i<N; i++){
                a[i]=in.nextInt();
            }
            int dp[] = new int[N];
            dp[1] = 0;
            //dp[2] = getCount(2);



        }
}
