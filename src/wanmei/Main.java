package wanmei;

import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/28.
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try {
            int n = in.nextInt();
            String s =in.nextLine();
            if(s.length()<=1){
                System.out.println();
                return;
            }
            String str = s.substring(1,s.length());
            StringBuffer sb = new StringBuffer();
            for(int i=0;i<n;i++){
                sb.append(str);
            }
            String str1 = sb.toString();

            System.out.println(str1);
        }catch (Exception e){
            System.out.println("error");
        }

    }
}
