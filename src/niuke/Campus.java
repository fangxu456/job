package niuke;

import org.junit.Test;

/**
 * Created by YJSYF on 2016/10/9.
 */
public class Campus {

    @Test
    public void test1(){
        System.out.println(countBitDiff(1999,2299));
    }

    //Ð¡Ã×
    public int countBitDiff(int m, int n) {
        int r = m^n;
        String s = Integer.toBinaryString(r);
        int count=0;
        /*for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }*/
        while (r!=0){
            r=r&(r-1);
            count++;
        }
        return count;
    }

    //È¥ÄÄ¶ù
    public int getPos(int[] A, int n, int val) {
        // write code here
        if(n<=0) {
            return -1;
        }
        int start = 0;
        int end = n-1;
        int mid;
        int result = 0;
        while(start <= end) {
            mid = (start + end) / 2;
            if(A[mid] < val) {
                start = mid + 1;
            } else if(A[mid] >= val) {
                end = mid -1;
            }
            result = start;
        }
        if(A[result] == val) {
            return result;
        } else {
            return -1;
        }
    }



}
