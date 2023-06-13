package coding_test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class RightBigNum_12Q {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		int size = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		stack.add(Integer.parseInt(st.nextToken()));
		for(int i=0; i<size-1; i++) {
			int num = Integer.parseInt(st.nextToken());
			stack.add(num);
		}
//		wr.write("-1 ");
		String result = "-1 ";
		int max = 0;
		for(int i=0; i<size-1; i++) {
			int num = stack.pop();
			if(num <= stack.peek()) {
				if(stack.peek()>=max) {
					result += -1 + " " ;
				}else {
					result += max + " ";
				}
			}else if(num > stack.peek()){
				result += num + " ";
				max = num;
			}
		}
		StringBuffer sb = new StringBuffer(result);
        String reverse = sb.reverse().toString();
		System.out.println(reverse.trim());
//		String result = wr.toString();
//		wr.
//		wr.close();
	}
}
