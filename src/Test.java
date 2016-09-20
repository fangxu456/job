
import java.util.*;

class FirstRepeat {
    public char findFirstRepeat(String A, int n) {
        List<Character> hm= new ArrayList<Character>();
        char[] c = A.toCharArray();
        char flag = ' ' ;
        for(int i=0;i<n;i++){
            if(!hm.contains(c[i])){
                hm.add(c[i]);
            }else{
                flag = c[i];
                break;
            }
        }
        return flag;

    }
}
