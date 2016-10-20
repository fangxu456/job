package dangdang;

import java.util.Scanner;

/**
 * Created by YJSYF on 2016/10/20.
 */
public class Test4 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int k = getRes(n);
            System.out.println(k+" "+k+1);
        }
        public static int getRes(int n){
            if(n==1){
                return 0;
            }else if(n==2){
                return 1;
            }else return getRes(n-1)+getRes(n-2);
        }
}
