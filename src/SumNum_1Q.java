package coding_test;

import java.util.Scanner;

public class SumNum_1Q {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = Integer.parseInt(sc.nextLine());
		String numString = sc.nextLine();
		System.out.println(sum(count,numString));
	}
	public static int sum(int count, String str) {
		int result = 0;
		for(int i = 0; i<count; i++) {
			result += (int)str.charAt(i)-'0';
		}
		return result;
	}
}
