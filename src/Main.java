import java.util.Scanner;

/**
 * Created by FangXu on 2016/9/5.
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[2*n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
            a[i+n] = a[i];
        }
        int sum = n;
        for(int j=0;j<n-1;j++){
            for(int k= j+2; k<n+1+j; k++){
                for(int p = j+1;p<k;p++){
                    if(a[j]>=a[p]&&a[k]>=a[p]){
                        sum++;
                        //// System.out.println(sum);
                    }
                }
            }
        }
        System.out.println(sum);
        //System.out.println(getValue(n,a));
        in.close();
    }
        private static int getValue(int n,int[] a){
        int sum = n;
        for(int j=0;j<n-1;j++){
            for(int k= j+2; k<n-3+j; k++){
                for(int p = j+1;p<k;p++){
                    if(a[j]>=a[p]&&a[k]>=a[p]){
                        sum++;
                       // System.out.println(sum);
                    }
                }
            }
        }
        return sum;
    }
}
