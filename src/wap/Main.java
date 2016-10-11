package wap;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by YJSYF on 2016/10/10.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int P = in.nextInt();
        int[][][] a = new int[M][M][M];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < M; k++) {
                    a[i][j][k] = in.nextInt();
                }
            }
        }
        ArrayList list = new ArrayList();
        int[] L = new int[N];
        for (int t = 0; t < N; t++) {
            L[t] = in.nextInt();
            int[][][] temp = new int[M][M][M];
            for (int i = 0; i < L[t]; i++) {
                for (int j = 0; j < L[t]; j++) {
                    for (int k = 0; k < L[t]; k++) {
                        temp[i][j][k] = in.nextInt();
                    }
                }
            }
            list.add(temp);
        }

        int I=0,J=0,K=0;
        for (int t = 0; t < list.size(); t++) {
            for (int i = 0; i < M - L[t]; i++) {
                for (int j = 0; j < M - L[t]; j++) {
                    for (int k = 0; k < M - L[t]; k++) {
                        //移动
                        int[][][] tmp = getMove((int[][][]) list.get(t), i, j, k, M);
                        int count = 0;

                        //
                        for (int ii = 0; ii < M; ii++) {
                            for (int jj = 0; jj < M; jj++) {
                                for (int kk = 0; kk < M; kk++) {

                                    //小cube相加
                                    int[][][] c = new int[M][M][M];
                                    for (int tt = 0; tt < N; tt++) {
                                        for (int iii = 0; iii < M; iii++) {
                                            for (int jjj = 0; jjj < M; jjj++) {
                                                for (int kkk = 0; kkk < M; kkk++) {
                                                    c[iii][jjj][kkk] += ((int[][][]) list.get(tt))[iii][jjj][kkk];
                                                }
                                            }
                                        }
                                    }
                                    System.out.println(c.toString());

                                    //相加后和大cube相加
                                    if ((a[ii][jj][kk] + c[ii][jj][kk])%P == 0) {
                                        count++;
                                    }
                                    if(count==Math.pow(M,3)){
                                        I=ii;
                                        J=jj;
                                        K=kk;
                                    }
                                }
                            }
                        }

                    }
                }
            }
        }
        System.out.println(I+" "+J+" "+K);
    }

    public static int[][][] getMove(int[][][] temp, int i, int j, int k, int M) {
        for (int ii = 0; ii < M; ii++) {
            for (int jj = 0; jj < M; jj++) {
                for (int kk = 0; kk < M; kk++) {
                    temp[(ii + i) % M][(jj + j) % M][(kk + k) % M] = temp[ii][jj][kk];
                }
            }
        }
        return temp;
    }

}
