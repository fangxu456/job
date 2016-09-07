package jd;

import java.util.Scanner;

/**
 * Created by lx on 2016/9/5.
 */
public class Demo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); //number of integer
        int[] data = new int[n];

        int k = 0;
        while( k < n) {
            data[k++] = in.nextInt();
        }

        int count = 0;
        int click = 1;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j ++) {
                if(i == j) continue;
                boolean flag = (check(data,data[i],i,data[j],j) || check(data,data[j],j,data[i],data[i]));
                System.out.printf("%d:  %d : %d == %b\n",click++, i, j, flag);
                if(flag) {
                    count ++;
                }
            }
        }

        System.out.println(count);
    }

    //判断这对数是否满足start和end大于它们之间所有数（顺时针）
    //如果满足返回true
    public static boolean check(int[] data, int start,int s_index, int end, int e_index) {
        boolean status = false;

        //如果相邻 返回true
        if(isSide(data,s_index,e_index))
            return true;

        //不相邻
        for(int i = 0; i < data.length; i ++) {
            if(s_index > e_index) {
                if(i > s_index || i < e_index) {
                    if(data[i] > start || data[i] > end)
                        return false;
                    else status = true;
                }
            } else {
                if(i > s_index && i < e_index) {
                    if(data[i] > start || data[i] > end)
                        return false;
                    else status = true;
                }
            }
        }

        return status;
    }

    //判断两数是否相邻
    public static boolean isSide(int[] data, int s_index, int e_index) {
        boolean status = false;

        //下标为0的和下标为n-1的相邻
        if((e_index ==0 && s_index == data.length -1) || (e_index == data.length -1 && s_index == 0))
            return true;

        //起点索引大于终点索引且下标相差1的相邻
        if(s_index < e_index && e_index - s_index == 1)
            return true;

        return status;
    }
}