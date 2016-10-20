package dangdang;

import java.util.Scanner;

/**
 * Created by YJSYF on 2016/10/20.
 */
public class Test3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = "A";
        int count1=1;
        int count2=0;
        for(int i=1;i<=n;i++){
            StringBuffer sb = new StringBuffer();
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)=='A'){
                    sb.append("B");
                    count1--;
                    count2++;
                }else if(str.charAt(j)=='B'){
                    sb.append("BA");
                    count1++;
                }
            }
            str = sb.toString();
        }
        /*for(int k=0;k<str.length();k++){
            if(str.charAt(k)=='A'){
                count1++;
            }
            if(str.charAt(k)=='B'){
                count2++;
            }
        }*/
        System.out.println(count1+" "+count2);
    }
}
