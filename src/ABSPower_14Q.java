package coding_test;

import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ABSPower_14Q {
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				if(Math.abs(o1)>Math.abs(o2)) {
//					return 1;
//				}else if(Math.abs(o1)==Math.abs(o2)) {
//					return o1-o2;
//				}else return -1;
//			}
//		});
//		for(int i = 0; i<=n; n++) {
//			int num = Integer.parseInt(br.readLine());
//			if(num !=0) {
//				pq.add(num);
//			}else {
//				if(pq.isEmpty()) {
//					System.out.println(0);
//				}else {
//					System.out.println(pq.poll());
//				}
//			}
//			
//		}
//	}
	// 입력값 런타임 에러
	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //입력값 처리하는 BufferedReader
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //결과값 처리하는 BufferedWriter
        //우선순위 큐 작성
    	PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
		@Override
        		//절대값에 따른 조건
			public int compare(Integer o1, Integer o2) {
            			//절대값이 같을 때
				if(Math.abs(o1) == Math.abs(o2)) {
					if(o1<o2)
						return -1;
					else
						return 1;
				}else //절대값이 다를 때
					return Math.abs(o1)-Math.abs(o2);
			}
		});
        //-------입력값 저장 및 명령어 결과 저장------
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++) {
        	int command = Integer.parseInt(br.readLine());
        	if(command == 0) {	//명령어 '0'일 때
        		if(queue.size()==0)
        			bw.write("0\n");
        		else
        			bw.write(queue.poll() + "\n");
        	}
        	else	//'0'이외에 정수일 때
        		queue.add(command);
        }
        bw.flush();		//결과 출력
        bw.close();
        br.close();
    }
}
