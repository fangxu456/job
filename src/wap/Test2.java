package wap;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by YJSYF on 2016/10/11.
 */
public class Test2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        //权值矩阵初始化
        int[] w = new int[N];
        for(int i=0;i<N;i++){
            w[i] = in.nextInt();
        }
        //邻接矩阵初始化
        int[][] a = new int[N][N];
        for(int j = 0;j<N-1;j++){
            int x = in.nextInt();
            int y = in.nextInt();
            a[x-1][y-1] = 1;
            a[y-1][x-1] = 1;
        }
        //更新后权值矩阵初始化
        int[] s = new int[N];
        for(int i=0;i<N;i++){
            s[i] = w[i];
            for(int j=0;j<N;j++){
                if(a[i][j]==1){
                    s[i]+=w[j];
                }
            }
        }
        //寻找最长线
        ArrayList list = new ArrayList();
        for(int i=0;i<N;i++){
            int count=0;
            for(int j=0;j<N;j++){
                if(a[i][j]==1){
                    count++;
                }
            }
            if(count==3){
                list.add(i);
            }
        }
        Object[] arr = list.toArray();
        int[][] a1 = new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(isConnected(i,j,a)){
                    a1[i][j]=1;
                    a1[j][i]=1;
                }
            }
        }




        System.out.println(list.size());






        /*int sum =0;
        for(int i=0;i<N;i++){
            if(s[i]>sum){
                sum=s[i];
            }
        }
        System.out.println(sum);*/
    }

    public static boolean isConnected(int i, int j, int[][] a){
        return true;
    }
}
