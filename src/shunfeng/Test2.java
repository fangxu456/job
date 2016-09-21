package shunfeng;

import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/21.
 */
public class Test2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.nextInt()!=0){
            int n = in.nextInt();
            int[] a  = new int[n];
            int sum = 0;
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
                sum+=a[i];
            }
            int min = 1;
            for(int i =1;i<sum;i++){
                if(isMin(i,sum,a)){
                    min = i;
                    break;
                }
            }
            System.out.println(min);
        }
    }
    public static boolean isMin(int i,int sum,int[] a){

        for(int j =1;j<a.length;j++){
        }
        return true;
    }

}
