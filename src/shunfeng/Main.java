package shunfeng;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by YJSYF on 2016/9/21.
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i=0;i<T;i++){
            int n =in.nextInt();int m =in.nextInt();
            int s =in.nextInt();int t =in.nextInt();
            int[] a = new int[n];
            for(int j =0;j<n;j++){
                a[j]=in.nextInt();
            }
            int[][] b = new int[n][n];
            for(int p=0;p<n;p++){
                for (int q=0;q<n;q++){
                    b[p][q]=0;
                }
            }
            for(int k=0;k<m;k++){
                b[in.nextInt()][in.nextInt()]=in.nextInt();
            }
            int count=0;int sum=a[s];int len =0;
            for(int r=1;r<n;r++) {
                while (b[s][r] != 0) {
                    if (r == t) {
                        count++;
                        count++;
                        count++;
                        sum+=a[r];
                        if(sum>len)
                            len=sum;
                        break;
                    } else {
                        s = r;
                        sum+=a[r];
                    }
                }
            }
            if(count!=0) {
                System.out.println("Case "+i+": "+count + " " + len);
            }else
                System.out.println("Case "+i+": No answer");
        }
    }
}
