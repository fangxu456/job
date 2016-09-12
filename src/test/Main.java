package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while(sc.hasNext()) {
            System.out.println(sc.nextInt());
            /*int num = sc.nextInt();
            for(int i=0; i<num; i++) {
                System.out.println(Fan(sc.nextInt()));
            }*/
        }

    }
    public static int Fan(int n) {
        if(n == 1) return 0;
        if(n == 2) return 1;
        if(n == 3) return 2;
        return Fan(n-1)+Fan(n-2);
    }
}