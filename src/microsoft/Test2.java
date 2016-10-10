package microsoft;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by YJSYF on 2016/10/10.
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        int M = in.nextInt();
        in.nextLine();
        String[] s = new String[M];
        for(int i=0;i<M;i++){
            s[i] = in.nextLine();
        }
        System.out.println(N-M);
    }
}
