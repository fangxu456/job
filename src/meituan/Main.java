package meituan;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by YJSYF on 2016/9/11.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, String> hashMap = new HashMap<>();
        while(in.hasNextLine()){
            String str = in.nextLine();
            hashMap.put(str.substring(0,str.indexOf(",")),str);
            //System.out.println(hashMap.get("1"));
        }

        System.out.println(getNum(hashMap));
    }
    public static int getNum(HashMap hashMap){
        return 0;
    }
}