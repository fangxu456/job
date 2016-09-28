package wanmei;

import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/28.
 */
public class Test2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int n = in.nextInt();
            if(n>100){
                System.out.println("no");
            }else{
                if(n<42){
                    System.out.println("1");
                }else if(n<76)
                    System.out.println("2");
                else if(n<94)
                    System.out.println("3");
                else
                    System.out.println("4");
            }
        }
    }
}
