package dp;

/**
 * Created by YJSYF on 2016/9/13.
 */
public class MaxSubString {
    public static void main(String[] args) {
        int n = 6;
        //int[] A = new int[n];
        int[] A = {0, -2, 3, 5, -1, 2};
        int Start = A[n - 1];
        int All = A[n - 1];

        for (int i = n - 2; i >= 0; i--)    //从后向前遍历，反之亦可。
        {
            Start = Math.max(A[i], A[i] + Start);
            All = Math.max(Start, All);
        }
        System.out.println(All);
    }
}
