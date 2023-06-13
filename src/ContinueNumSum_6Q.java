package coding_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ContinueNumSum_6Q {
	public static void main(String[] args) throws IOException {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st=new StringTokenizer(br.readLine());
      int n=Integer.parseInt(st.nextToken());
      int sum = 0;
      int i = 0;
      int j = 0;
      int count = 0;
      while(i<=n) {
    	  if (sum<n) {
    		  sum+= ++i;  
    	  }else if(sum == n) {
    		  count++;
    		  sum += --j;
    	  }else if(sum>n) {
    		  sum += --j;
    	  }
      }
      System.out.println(count);
	}
}
