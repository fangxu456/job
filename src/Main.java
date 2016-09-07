import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s = in.nextLine();
            System.out.println(getResult(s));
        }
    }
    public  static int getResult(String s){
        int len =s.length();
        String res = new StringBuffer(s).reverse().toString();
        int[][] data = new int[len+1][len+1];
        for(int i=0;i<len+1;i++){
            data[i][0]=data[0][i]=0;
        }
        for(int i=1;i<len+1;i++){
            for(int j=1;j<len+1;j++){
                if(s.charAt(i-1)==res.charAt(j-1)){
                    data[i][j]=data[i-1][j-1]+1;
                }else if(data[i-1][j]>=data[i][j-1]){
                    data[i][j]=data[i-1][j];
                }else
                    data[i][j]=data[i][j-1];
            }
        }
        return len-data[len][len];
    }
}
