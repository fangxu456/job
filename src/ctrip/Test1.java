package ctrip;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			double d = n;
			int m = in.nextInt();
			double sum =0;
			for(int i=0;i<m;i++){
				sum+=d;
				d=Math.sqrt(d);
			}
			System.out.printf("%.2f",sum);
		}
	}

}
