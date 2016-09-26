package xiaomi;

import java.util.Scanner;

/**
 * Created by FangXu on 2016/9/23.
 */
public class Test2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            String[] strList = str.split(" ");
            System.out.print(strList[strList.length-1]);
            for(int i =1;i<strList.length;i++){
                System.out.print(" "+strList[strList.length-1-i]);
            }
            System.out.println();
        }
    }
}
