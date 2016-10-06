package niuke;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YJSYF on 2016/10/6.
 */
public class Ctci {
    @Test
    public void test1(){
        System.out.println(reverseString("abcdefg"));
    }
    public String reverseString(String iniString) {
        String str = "";
        for(int i= 0; i<iniString.length(); i++){
            str = iniString.charAt(i)+str;
        }
        return str;
    }

    @Test
    public void test2(){
        System.out.println(checkSam("This is nowcoder","is This nowcoder"));
    }
    public boolean checkSam(String stringA, String stringB) {
        // write code here
        List<String> list = new ArrayList<>();
        for(int i = 0;i<stringA.length();i++){
            list.add(String.valueOf(stringA.charAt(i)));
        }
        for(int j = 0;j<stringB.length();j++){
            if(list.contains(String.valueOf(stringB.charAt(j))))
                //list.remove(stringB.charAt(j));
                //System.out.println(stringB.charAt(j));
                list.remove(String.valueOf(stringB.charAt(j)));

        }
        if(list.size()==0){
            return true;
        }else {
            return false;
        }
    }
}
