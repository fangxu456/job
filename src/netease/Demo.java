package netease;

import java.util.Scanner;

/**
 * Created by FangXu on 2016/9/11.
 */
public class Demo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i]=in.nextLine();
        }
        if(isC(n,str)){
            if(isL(n,str)){
                System.out.println("both");
            }else{
                System.out.println("lexicographically");
            }
        }else{
            if(isL(n,str)){
                System.out.println("lengths");
            }else{
                System.out.println("none");
            }
        }
    }
    public static boolean isC(int n, String[] str){
        Boolean flag = true;
        for(int i=0; i<n-1; i++){
            for(int j =0; j<str[i].length()&&j<str[i+1].length(); j++){
                if(str[i].charAt(j)>str[i+1].charAt(j)){
                    flag = false;
                }
            }
            if(str[i].length()>str[i+1].length()){
                int count =0;
                for(int j=0;j<str[i+1].length(); j++){
                    if(str[i].charAt(j)==str[i+1].charAt(j)){
                        count++;
                    }
                }
                if(count == str[i+1].length()){
                    flag = false;
                }

            }
        }
        return flag;
    }
    public static boolean isL(int n, String[] str){
        Boolean flag = true;
        for(int i=0; i<n-1; i++){
            if(str[i].length()>str[i+1].length()){
                flag = false;
            }
        }
        return flag;
    }
}
