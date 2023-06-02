package coding_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AvgScore_2Q {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		String[] subject = sc.nextLine().split(" ");
		ArrayList<Integer> al = chageInt(count, subject);
		System.out.println(fakeScore(count, al));
	}
	public static Double fakeScore(int count,ArrayList<Integer> score) {
		// 가짜 점수 출력  점수 / high * 100
		int high = Collections.max(score);
		double sum = 0;
		for(int i =0; i<count; i++) {
			sum+=(double)score.get(i)/ high *100; 
		}
		return (double)sum/count;
	}
	public static ArrayList<Integer> chageInt(int count, String[] subject) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (String item : subject) {
			al.add(Integer.parseInt(item));
		}
		return al;
	}
}
