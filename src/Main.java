import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(countNum(n));

    }
    public static long countNum(int n){
        long res =1;
        if(n==1){
            return 3;
        }else{
            for(int i=1;i<=n;i++){
                res = res*3;
            }
            return res-(n-2)*6;
        }

    }
}
