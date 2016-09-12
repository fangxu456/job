package netease;

/**
 * Created by YJSYF on 2016/9/12.
 * 暗黑字符串
 */
import java.util.Scanner;
public class AnHei {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int a = in.nextInt();
            if(a==1){
                System.out.println(3);
            }else{
                System.out.println(p(a));
            }
        }
    }
    // 后两个字母相同的情况
    public static long t(int x){
        if(x == 2)
            return 3;
        else{
            return p(x-1);
        }
    }
    public static long p(int x){
        if(x == 2)
            return 9;
        else{
            return t(x-1)*3+(p(x-1)-t(x-1))*2;
        }
    }

}
