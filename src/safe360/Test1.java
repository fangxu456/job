package safe360;

import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/20.
 */
public class Test1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            String str = String.valueOf(n);
            int count=(int)Math.pow(2,str.length()-1)-1;
            //int count=0;
            if(Integer.parseInt(String.valueOf(str.charAt(0)))==1){
                for(int i=1;i<str.length();i++){
                    if(Integer.parseInt(String.valueOf(str.charAt(i)))>1){
                        count+=(int)Math.pow(2,str.length()-i);
                        break;
                    }else if(Integer.parseInt(String.valueOf(str.charAt(i)))==1){
                        count+=(int)Math.pow(2,str.length()-i-1);
                    }else count++;
                }
            }else
                count=(int)Math.pow(2,str.length())-1;

            System.out.println(count);
        }
    }

}
