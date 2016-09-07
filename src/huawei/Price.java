import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by ASUS on 2016/8/11.
 */
public class Price {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double d = Double.parseDouble(in.nextLine());
        int time = Integer.parseInt(in.nextLine());
        System.out.println(total(d,time));
    }

    public static double total(double d, int time){
        if(d<2&&time<10){
            return 6;
        }
        DecimalFormat df   = new DecimalFormat("######0.0");
        double p1;
        double p2;
        if(d<7){
            p1=6+0.7*(int)((d-2)/0.5);
        }else {
            p1=6+0.7*(int)((d-2)/0.5)+0.7*(int)(d-7);
        }
        p2=1.4*(int)(time/3);
        if(p1>=p2){
            return Double.parseDouble(df.format(p1));
        }else{
            return Double.parseDouble(df.format(p2));
        }
    }
}
