package coding_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Decimal_1978Q {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int count = 0;
		st = new StringTokenizer(br.readLine());
		
		for(int i =0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			for(int j = 2; j<=num; j++) {
				if(num%j==0) {
					if(num==j) {
						count++;
						break;
					}else{
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
}
