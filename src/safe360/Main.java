package safe360;

import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/18.
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            System.out.println(getCount(n));
        }
    }
    public static int getCount(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(isMatch(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean isMatch(int i){
        String str = String.valueOf(i);
        boolean flag = true;
        for(int j=0;j<str.length();j++){
            if(str.charAt(j)!='0'&&str.charAt(j)!='1'){
                flag =false;
                break;
            }
        }
        return flag;
    }
}
