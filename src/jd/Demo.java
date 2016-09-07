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

    //�ж�������Ƿ�����start��end��������֮����������˳ʱ�룩
    //������㷵��true
    public static boolean check(int[] data, int start,int s_index, int end, int e_index) {
        boolean status = false;

        //������� ����true
        if(isSide(data,s_index,e_index))
            return true;

        //������
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

    //�ж������Ƿ�����
    public static boolean isSide(int[] data, int s_index, int e_index) {
        boolean status = false;

        //�±�Ϊ0�ĺ��±�Ϊn-1������
        if((e_index ==0 && s_index == data.length -1) || (e_index == data.length -1 && s_index == 0))
            return true;

        //������������յ��������±����1������
        if(s_index < e_index && e_index - s_index == 1)
            return true;

        return status;
    }
}