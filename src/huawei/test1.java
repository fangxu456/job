package huawei;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		/*while (in.hasNext()) {
			n = in.nextInt();
		}*/
		while(n/12 != 0){
			printRes(n/12);
			//System.out.println(n/12);
			n = n % 12;
		}
		printRes(n);
		

	}
	private static void printRes(int n){
		if(n==10){
			System.out.print("A");
			}else if(n == 11){
				System.out.print("B");
			}else {
				System.out.print(n);
			}
	}
	
}
