package toutiao;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int index =1;
        for(int i=1;i<=n;i++){
            if(isAhead(m,i)){
                index ++;
            }
        }
        System.out.println(index);
    }
    public static boolean isAhead(int m,int i){
        String str_m = String.valueOf(m);
        String str_i = String.valueOf(i);
        boolean flag = true;
        if(str_i.length()>str_m.length()){
            for(int j=0;j<str_m.length();j++){
                if(str_i.charAt(j)<str_m.charAt(j)){
                    return flag;
                }
            }
        }else {
            for(int j=0;j<str_i.length();j++){
                if(str_i.charAt(j)>str_m.charAt(j)){
                    flag = false;
                }
            }
        }
        return flag;
    }
}
