package ctrip;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int m = in.nextInt();
			int n = in.nextInt();
			List<Integer> list = new ArrayList<>();
			for(int i = m;i<=n;i++){
				if(isSXH(i)){
					list.add(i);
				}
			}
			if(list.size()==0){
				System.out.println("no");
			}else if(list.size()==1){
				System.out.println(list.get(0));
				}
			else {
				System.out.print(list.get(0));
				for(int k = 1;k<list.size();k++){
					System.out.print(" "+list.get(k));
					System.out.println();
				}

			}
		}
		
	}
	public static boolean isSXH(int i){
		boolean flag = false;
		String str = String.valueOf(i);
		int sum =0;
		for(int j=0;j<str.length();j++){
			String s = String.valueOf(str.charAt(j));
			sum+=Math.pow(Integer.parseInt(s), 3);
		}
		if(sum==i){
			flag=true;
		}
		return flag;
	}
}
