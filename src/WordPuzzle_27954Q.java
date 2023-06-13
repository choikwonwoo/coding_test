package coding_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class WordPuzzle_27954Q {
	static char[][] board;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		board = new char[N][M];
		for (int i = 0; i<N; i++) {
			board[i] = br.readLine().toCharArray();
		}
		// 문제 받기
		for(int i = 0; i<Q; i++) {
			st = new StringTokenizer(br.readLine());
			if(Integer.parseInt(st.nextToken())!=2) {
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				Swap(x, y, N, M);
			}else {
				// 출력
				for(int j = 0; j<N; j++) {
					System.out.println(Arrays.toString(board[j]));
				}
			}
		}
	}
	public static void Swap(int x, int y, int N, int M) {
		Stack<Character> stack = new Stack<Character>();
		int j = 0;
		for(int i = 0; i<N; i++) {
			for(; j<M; j++) {
				if(i<x-1 && j==y-1) {
					stack.add(board[i][j]);
					j=0;
					break;
				}else if(i==x-1 && j==y-1) {
					stack.add(board[i][j]);
					i=0;
				}else if(i<x-1 && j==M-1) {
					stack.add(board[i][j]);
					j=y;
					break;
				}else if(i==x-1&&j==M-1) {
					stack.add(board[i][j]);
					j=0;
					break;
				}else if(i>x-1&&i<N-1 && j==y-1) {
					stack.add(board[i][j]);
					j=0;
					break;
				}else if(i==N-1 && j==y-1) {
					stack.add(board[i][j]);
					i=x;
				}else if(i>x-1&&i<N-1 && j==M-1) {
					stack.add(board[i][j]);
					j=y;
					break;
				}else{
					stack.add(board[i][j]);
				}
				
			}
		}
		j = 0;
		for(int i = 0; i<N; i++) {
			for(; j<M; j++) {
				if(i<x-1 && j==y-1) {
					board[i][j]=stack.pop();
					j=0;
					break;
				}else if(i==x-1 && j==y-1) {
					board[i][j]=stack.pop();
					i=0;
				}else if(i<x-1 && j==M-1) {
					board[i][j]=stack.pop();
					j=y;
					break;
				}else if(i==x-1&&j==M-1) {
					board[i][j]=stack.pop();
					j=0;
					break;
				}else if(i>x-1&&i<N-1 && j==y-1) {
					board[i][j]=stack.pop();
					j=0;
					break;
				}else if(i==N-1 && j==y-1) {
					board[i][j]=stack.pop();
					i=x;
				}else if(i>x-1&&i<N-1 && j==M-1) {
					board[i][j]=stack.pop();
					j=y;
					break;
				}else{
					board[i][j]=stack.pop();
				}
				
			}
		}
	}
}
