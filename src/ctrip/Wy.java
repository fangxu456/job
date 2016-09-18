package ctrip;

import java.util.Scanner;

public class Wy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] input = sc.nextLine().split(",");
			int maxVal = Integer.MIN_VALUE;
			int minVal = Integer.MAX_VALUE;
			int maxValIndex = 0;
			for (int i = 0; i < input.length; i++) {
				int val = Integer.parseInt(input[i]);
				if (val > maxVal) {
					maxVal = val;
					maxValIndex = i;
				}
				if (val < minVal && i <= maxValIndex) {
					minVal = val;
				}
			}
			System.out.println(maxVal-minVal);
		}
	}
}
