package ctrip;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();		
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		int flag = -1;
		if(a[0]==m){
			flag = 0;
		}
		for(int k =1; k<a.length;k++){
			if(a[k]==m){
				flag=k;
				break;
			}
			if(a[k-1]<m&&a[k]>m){
				flag-=k;
				break;
			}
		}
		if(a[n-1]<m){
          	flag-=n;
          }
		System.out.println(flag);	
		
	}
}
