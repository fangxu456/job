package qunaer;

import java.util.*;

public class Test2 {
    public static String getLCString(char[] str1, char[] str2) {
        int i, j;
        int len1, len2;
        len1 = str1.length;
        len2 = str2.length;
        int maxLen = len1 > len2 ? len1 : len2;
        int[] max = new int[maxLen];
        int[] maxIndex = new int[maxLen];
        int[] c = new int[maxLen]; // 记录对角线上的相等值的个数

        for (i = 0; i < len2; i++) {
            for (j = len1 - 1; j >= 0; j--) {
                if (str2[i] == str1[j]) {
                    if ((i == 0) || (j == 0))
                        c[j] = 1;
                    else
                        c[j] = c[j - 1] + 1;
                } else {
                    c[j] = 0;
                }

                if (c[j] > max[0]) { // 如果是大于那暂时只有一个是最长的,而且要把后面的清0;
                    max[0] = c[j]; // 记录对角线元素的最大值，之后在遍历时用作提取子串的长度
                    maxIndex[0] = j; // 记录对角线元素最大值的位置

                    for (int k = 1; k < maxLen; k++) {
                        max[k] = 0;
                        maxIndex[k] = 0;
                    }
                } else if (c[j] == max[0]) { // 有多个是相同长度的子串
                    for (int k = 1; k < maxLen; k++) {
                        if (max[k] == 0) {
                            max[k] = c[j];
                            maxIndex[k] = j;
                            break; // 在后面加一个就要退出循环了
                        }

                    }
                }
            }
        }

        StringBuffer res = new StringBuffer();
        boolean flag = false;
        for (j = 0; j < maxLen; j++) {
            if (max[j] > 0) {
                //System.out.print("result=");
                for (i = maxIndex[j] - max[j] + 1; i <= maxIndex[j]; i++){
                    res.append(str1[i]);
                }
                //System.out.print(str1[i]);

                flag = true;
                break;
            }
        }
        // if(!flag) System.out.print("");
        if(!flag) res.append("");
        return res.toString();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str1=in.next();
        String str2=in.next();
        String res = getLCString(str1.toCharArray(), str2.toCharArray());
        if(!"".equals(res))
            System.out.print("result="+res);
        else
            System.out.print(res);
    }
}
