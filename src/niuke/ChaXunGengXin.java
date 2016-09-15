package niuke;

import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/15.
 */
public class ChaXunGengXin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int a[] = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = in.nextInt();
        }
        in.nextLine();
        for(int j=0; j<M; j++){
            String str = in.nextLine();
            String[] list = str.split(" ");
            if(list[0].equals("Q")){
                int temp=0;
                int m = Math.max(Integer.parseInt(list[1]),Integer.parseInt(list[2]));
                int n = Math.min(Integer.parseInt(list[1]),Integer.parseInt(list[2]));
                for(int k=n;k<=m;k++){
                    if(a[k-1]>temp){
                        temp=a[k-1];
                    }
                }
                System.out.println(temp);
            }
            if(list[0].equals("U")){
                a[Integer.parseInt(list[1])-1]=Integer.parseInt(list[2]);
            }
        }


    }
}
