import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sumArray_7Q {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] array=new int[n];
        int count = 0;
        for(int i=0;i<n;i++) { // i까지의 누적합 구하기
            array[i]=Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(array[i] + array[j] == m){
                    count++;
                }
            }
        }
        System.out.println(count);


    }
}
