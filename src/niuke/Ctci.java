package niuke;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by YJSYF on 2016/10/6.
 */
public class Ctci {
    @Test
    public void test(){
//        System.out.println(reverseString("abcdefg"));
//        System.out.println(checkSam("This is nowcoder","is This nowcoder"));
//        System.out.println(replaceSpace("Mr John Smith",13));
//        System.out.println(clearZero([[1,2,3],[0,1,2],[0,0,1]],3));

    }

    public String reverseString(String iniString) {
        String str = "";
        for(int i= 0; i<iniString.length(); i++){
            str = iniString.charAt(i)+str;
        }
        return str;
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

    public String replaceSpace(String iniString, int length) {
        // write code here
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<iniString.length();i++){
            if(iniString.charAt(i)==' '){
                sb.append("%20");
            }else
                sb.append(iniString.charAt(i));
        }
        return sb.toString();
    }

    public int[][] clearZero(int[][] mat, int n) {
        // write code here
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    s1.add(i);
                    s2.add(j);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(s1.contains(i)||s2.contains(j)){
                    mat[i][j]=0;
                }
            }
        }
        return mat;
    }
}
