import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DevideSector_5Q {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int[] array1=new int[n];
        int[] array2=new int[n+1];
        int count = 0;
        // 문제의 배열
        for(int i=0;i<n;i++) {
            array1[i] =Integer.parseInt(st.nextToken());
        }
        // 배열의 누적 합
        array2[0] = array1[0];
        for(int i=1;i<n;i++) {
            array2[i] = array2[i-1] + array1[i];
            if(array2[i-1] % m == 0){
                // 누적합 중에서 m의 배수
                int sum = 0;
                int k = n;
                int j = 0;
                while(k>=0){
                    sum += array1[n-k+j];
                    k--;
                    if(sum == array2[i-1]){
                        count++;
                        sum = 0;
                        j++;
                        k = n;
                    }else if(sum > array2[i-1]){
                        sum = 0;
                        j++;
                        k = n;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
