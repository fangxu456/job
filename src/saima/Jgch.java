package saima;

import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/8.
 * 击鼓传花
 * 动态规划
 */
import java.util.Scanner;

public class Jgch {
    public static void main(String[] args) {
        int dp[][] = new int [35][35];
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        dp[0][1]=1;
        dp[1][n]=1;
        dp[1][2]=1;
        for(int i=1;i <= m;i++) {
            for(int j=1;j <= n;j++) {
                if(j == 1)
                    dp[i][j]=dp[i-1][n]+dp[i-1][2];
                else if(j==n)
                    dp[i][j]=dp[i-1][1]+dp[i-1][n-1];
                else
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j+1];
            }
        }
        //dp[m][1]：经过m步传到第一个人
        System.out.println(dp[m][1]);
    }
}
