package meituan;

import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/11.
 * 红包问题，动态规划
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] a = new int[N];
        //这一步很重要，将光标移到下一行
        in.nextLine();
        for(int j = 0; j<N; j++){
            String str = in.nextLine();
            String[] numList = str.split(",");
            int[] temp = new int[numList.length];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = Integer.parseInt(numList[i]);
                //System.out.println(temp[i]);
            }
            //第一类，选取红包0，然后对红包2到红包n-2进行DP
            int ans = temp[0] + Choose(2, temp.length - 2,temp);
            //第二类，不选取红包0，然后对红包1到红包n-1进行DP
            ans = Math.max(ans, Choose(1, temp.length - 1,temp));
            a[j]= ans;
        }
        for(int k : a){
            System.out.println(k);
        }
    }
    public static int getMax(int[] temp){
        /*int[] begin = temp;
        int sum = 0;
        Arrays.sort(temp);*/
        for(int i=temp.length-1;i>=0;i--){
            /*if(isOk(temp[i])){
                sum+=temp[i];
            }*/
        }
        return 1;
    }
    public static int Choose(int begin, int end, int[] temp){
        if (end < begin) return 0;
        //dp[0]；不选取当前位置红包 dp[1]: 选取当前位置红包
        int[]  dp = new int[2];
        int cache;
        for (int i = begin; i <= end; i++)
        {
            //保存dp[0]
            cache = dp[0];
            //更新dp[0]:上一轮中的最大值
            dp[0] = Math.max(dp[0], dp[1]);
            //更新dp[1]: 当前红包值+上一轮dp[0]
            dp[1] = cache + temp[i];
        }
        return Math.max(dp[0], dp[1]);
    }
}