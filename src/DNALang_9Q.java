import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class DNALang_9Q {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int start = 0;
        int end = p;
        int count=0;
        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        String pw;
        st = new StringTokenizer(br.readLine());
        int A= Integer.parseInt(st.nextToken());
        int C= Integer.parseInt(st.nextToken());
        int G= Integer.parseInt(st.nextToken());
        int T= Integer.parseInt(st.nextToken());

        while(end <= s){
            // 문자열을 추출한 후 검사
            pw = str.substring(start++,end++);
            // 문자 갯수 조건
            boolean a = pw.length() - pw.replace("A","").length()>=A;
            if(!a){
                continue;
            }
            boolean c = pw.length() - pw.replace("C","").length()>=C;
            if(!c){
                continue;
            }
            boolean g = pw.length() - pw.replace("G","").length()>=G;
            if(!g){
                continue;
            }
            boolean t = pw.length() - pw.replace("T","").length()>=T;
            if(t){
                count++;
            }

        }
        System.out.println(count);
    }
}
