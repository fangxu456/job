package didi; /**
 * Created by FangXu on 2016/9/18.
 */
import java.util.Scanner;
public class Demo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //System.out.print(n);
        int count1 =0;
        int count2 =0;
        for(int i =1;i<=n;i++){
            count1 += getCount1(i);
            //System.out.print(getCount1(i));
            count2 += getCount2(i);
            //System.out.print(getCount2(i));
        }
        int sum=0;
        if( count1>=count2){
            sum=count2;
        }else
            sum=count1;
        System.out.println(sum);
    }
    public static int getCount1(int i){
            int count1 = 0;
            while(i%2==0){
                count1++;
                i/=2;
            }
            return count1;
    }
    public static int getCount2(int i){
        int count2 = 0;
        while(i%5==0){
            count2++;
            i/=5;
        }
        return count2;
    }

}