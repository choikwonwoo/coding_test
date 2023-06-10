import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class goodNum_8Q {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
           arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int count = 0;
        int target = n-1;
        int j = target;
        int i = 0;

        while (target >-1){
            if(arr[i] + arr[j] == arr[target]){
                if(i == target){
                    i++;
                }else if(j == target){
                    j--;
                }else{
                    count++;
                    target--;
                    j = n-1;
                    i = 0;
                }
            }else if (arr[i] + arr[j] < arr[target]){
                i++;
            }else if (arr[i] + arr[j]> arr[target]){
                j--;
            }
            if(j<=i){
                target--;
                j = n-1;
                i = 0;
            }
        }
        System.out.println(count);
    }
}
