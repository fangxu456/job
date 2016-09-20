package qunaer;

import java.util.Scanner;

/**
 * Created by FangXu on 2016/9/20.
 */
public class Demo {
    public static void  main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str1 = str.replace("{","");
        String str2  =str1.replace("}","");
        String str5 = str2.replace(","," ");
        String[] str4 = str5.split(" ");
        int[] num = new int[str4.length];
        for(int i =0;i<num.length;i++){
            num[i]=Integer.parseInt(str4[i]);
            System.out.println(num[i]);
        }

        }
}
