package ctrip;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
		int n = in.nextInt();
		in.nextLine();
		int[][] b = new int[n][n]; 
		for(int i=0;i<n;i++){
			String str = in.nextLine();
            String[] numList = str.split(",");          
            for (int j = 1; j < numList.length; j++) {
                b[i][j] = Integer.parseInt(numList[j]);
            }
		}
		
	}
}