package coding_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class CardGame_13Q {
	// n번 까지의 카드를 받는다.
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Deque<Integer> dq = new ArrayDeque<Integer>();
		int n = Integer.parseInt(st.nextToken());
		
		for(int i =1; i<n+1; i++) {
			dq.addLast(i);
		}	
		while(dq.size()>1) {
			dq.removeFirst();
			dq.addLast(dq.poll());
		}
		//  제일 위에 있는 카드를 바닥에 버린다. 
		// 그 다음, 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮긴다.
		System.out.println(dq.peek());
	}
}
