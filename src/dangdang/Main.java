package dangdang;

import java.util.Scanner;

/**
 * Created by YJSYF on 2016/10/20.
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            int count=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==' '){
                    count++;
                }else break;
            }
            if(count==0){
                System.out.print(str);
            }
        }
    }
}
