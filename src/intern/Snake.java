package intern;

import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/4.
 */
public class Snake {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("«Î ‰»ÎN£∫");
        int N=input.nextInt();
        int a[][]=new int [N][N];
        int k=1;
        for(int i=0;i<N;i++)
        {
            int t=i;
            for(int j=0;j<=i;j++)
            {
                a[t][j]=k;
                k++;
                t--;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[1].length;j++)
            {
                if(a[i][j]!=0) System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
