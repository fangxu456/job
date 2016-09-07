package saima;

import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/6.
 */
public class Jgsg {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        int m = in.nextInt();
        //Integer.toBinaryString(int i);
        int count = 0;
        int count1 = 2;
        int count2 = 2;
        while(l/2>=2){
            l=l/2;
            count1++;
        }
        while(l/2>=2){
            l=l/2;
            count2++;
        }
        for(int i = count1; i<=count2; i++){
            //if(){

            //}
        }
        StringBuffer str = new StringBuffer("abc");
        str.reverse();


    }
}
