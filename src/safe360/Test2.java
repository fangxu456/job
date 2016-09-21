package safe360;

import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/20.
 */
public class Test2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            String s3 = in.nextLine();
            if(s1.charAt(0)==s3.charAt(2)&&s1.charAt(1)==s3.charAt(1)&&s1.charAt(2)==s3.charAt(0)&&s2.charAt(0)==s2.charAt(2)){
                System.out.println("YES");
            }else
                System.out.println("NO");
        }
    }
}
