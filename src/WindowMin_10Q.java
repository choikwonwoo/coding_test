package coding_test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class WindowMin_10Q {
	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int n = Integer.parseInt(st.nextToken());
//		int l = Integer.parseInt(st.nextToken());
//		int[] arr = new int[n]; 
//		int[] d = new int [n];
//		st = new StringTokenizer(br.readLine());
//		arr[0] = Integer.parseInt(st.nextToken());
//		int min = arr[0];
//		d[0] = arr[0];
//		int head = 0;
//		int count =0;
//		for (int i = 1; i<n; i++) {
//			head = Integer.parseInt(st.nextToken());
//			arr[i] = head;
//			if(arr[i-1]<=head) {
//				min = arr[i-1];
//				count = 0;
//			}else if(arr[i-1]>head) {
//				count++;
//			}
//			d[i] = min;
//		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		
		Deque<int[]> q = new ArrayDeque<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			while(!q.isEmpty() && q.peekLast()[0] > num) q.pollLast();
			
			q.offer(new int[] {num,i});
			if(q.peek()[1] < i -(l-1)) {
				q.poll();
			}
			bw.write(q.peek()[0]+" ");
		}
		bw.flush();
		bw.close();
	}
}
