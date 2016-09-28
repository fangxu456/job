package toutiao;

import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/28.
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            String str2 = shift(str,i);
            //System.out.println(str2);
            if(str2.equals(str)){
                count ++;
            }
        }
        System.out.println(count);
    }
    public static String shift(String str,int i){
        StringBuffer sb = new StringBuffer();
        String str1 = str.substring(0,i);
        //System.out.println(str1);
        String str2 = str.substring(i,str.length());
        //System.out.println(str2);
        sb.append(str2);
        sb.append(str1);
        String strres = sb.toString();
        return strres;
    }
}
