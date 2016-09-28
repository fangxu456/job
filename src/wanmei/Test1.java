package wanmei;

import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/28.
 */
public class Test1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            while (in.hasNext()) {
                String s = in.nextLine();
                if(s.length()==0){
                    System.out.println("error");
                    return;
                }
                try{
                    int n = Integer.parseInt(s.substring(0,1));
                    //System.out.println(n);
                    if (s.length() <= 1) {
                        System.out.println();
                        return;
                    }
                    String str = s.substring(2, s.length());
                    StringBuffer sb = new StringBuffer();
                    for (int i = 0; i < n; i++) {
                        sb.append(str);
                    }
                    String str1 = sb.toString();

                    System.out.println(str1);
                }catch (Exception e){
                    System.out.println("error");
                }

            }
    }
}
