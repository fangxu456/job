package test;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(Rev(x));
        System.out.println(Rev(y));
        System.out.println(Rev(Rev(x)+Rev(y)));
    }
    public static int Rev(int n){
        String str = String.valueOf(n);
        int count = 0;
        int m = 1;
        for(int i = str.length()-1; i>=0; i--){
            String temp = String.valueOf(str.charAt(i));
            count+=Integer.parseInt(temp)*m;
            m*=10;
        }
        return count;
    }
}
