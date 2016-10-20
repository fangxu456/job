package dangdang;
import java.util.Scanner;
public class Test2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] num= new int[n];
        for(int i=0;i<n;i++){
            num[i]=i+1;
        }
        int i=0;
        int quitnum=0;
        int k=0;
        while(quitnum < n-1){
            if(num[i]!=0)
                k++;
            if(k==3){
                num[i]=0;
                quitnum++;
                k=0;
            }
            i++;
            if(i==n)
                i=0;
        }
        for(int j=0;j<n;j++){
            if(num[j]!=0){
                System.out.print(num[j]);
            }
        }

    }
}