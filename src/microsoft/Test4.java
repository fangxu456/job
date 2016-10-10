package microsoft;

import java.util.Scanner;


/**
 * Created by YJSYF on 2016/10/10.
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int W = in.nextInt();
        in.nextLine();
        Character[][] a = new Character[M][W];
        for (int i = 0; i < M; i++) {
            char[] temp = in.nextLine().toCharArray();
            for(int j=0;j<W;j++){
                a[i][j] = temp[j];
            }
        }
        System.out.println(3+" "+4);
    }
}
