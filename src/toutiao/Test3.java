package toutiao;

import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/28.
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n+1];
        for(int k=0;k<=n;k++){
            a[k]=k;
        }
        for (int i = 1; i <=n; i++) {
            for (int j = i+1; j <= n; j++) {
                if(isAhead(a[i],a[j])){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a[m]);
        /*for(int i =0;i<=n;i++){
            System.out.println(a[i]);
        }*/
    }
    //判断i是否在m前面
    public static boolean isAhead(int m,int i){
        String str_m = String.valueOf(m);
        String str_i = String.valueOf(i);

        if(str_i.length()>str_m.length()){
            boolean flag = false;
            for(int j=0;j<str_m.length();j++){
                if(str_i.charAt(j)<str_m.charAt(j)){
                    flag = true;
                }
            }
            return flag;
        }else {
            boolean flag = true;
            for(int j=0;j<str_i.length();j++){
                if(str_i.charAt(j)>str_m.charAt(j)){
                    flag = false;
                }
            }
            return flag;
        }
    }
}
