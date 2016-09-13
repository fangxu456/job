package meituan;

import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/11.
 * ������⣬��̬�滮
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] a = new int[N];
        //��һ������Ҫ��������Ƶ���һ��
        in.nextLine();
        for(int j = 0; j<N; j++){
            String str = in.nextLine();
            String[] numList = str.split(",");
            int[] temp = new int[numList.length];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = Integer.parseInt(numList[i]);
                //System.out.println(temp[i]);
            }
            //��һ�࣬ѡȡ���0��Ȼ��Ժ��2�����n-2����DP
            int ans = temp[0] + Choose(2, temp.length - 2,temp);
            //�ڶ��࣬��ѡȡ���0��Ȼ��Ժ��1�����n-1����DP
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
        //dp[0]����ѡȡ��ǰλ�ú�� dp[1]: ѡȡ��ǰλ�ú��
        int[]  dp = new int[2];
        int cache;
        for (int i = begin; i <= end; i++)
        {
            //����dp[0]
            cache = dp[0];
            //����dp[0]:��һ���е����ֵ
            dp[0] = Math.max(dp[0], dp[1]);
            //����dp[1]: ��ǰ���ֵ+��һ��dp[0]
            dp[1] = cache + temp[i];
        }
        return Math.max(dp[0], dp[1]);
    }
}