import java.util.Scanner;
// 시간 초과
public class SumRange_3Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] line1 = makeArr(sc.nextLine());
        int[] line2 = makeArr(sc.nextLine());
        int[] result = new int[line1[1]];

        int i = 0;

        while(i<line1[1]){
            int[] range =  makeArr(sc.nextLine());
            result[i] = solve(line2,range[0]-1,range[1]-1);
            i++;
        }
        print(result);
    }
    public static int[] makeArr(String line){
        String[] lineArr =line.split(" ");
        int[] numArr = new int[lineArr.length];
        for (int i = 0; i< lineArr.length ; i++){
            numArr[i] = Integer.parseInt(lineArr[i]);
        }
        return numArr;
    }
    public static int solve(int[] arr, int start, int end){
        int sum = 0;
        for (int i = start; i<=end; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void print(int[] arr){
        for (int item : arr){
            System.out.println(item);
        }
    }
}
// 정답
//    static int[] array;
//    public static void main(String[] args) throws IOException {
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st=new StringTokenizer(br.readLine());
//        int n=Integer.parseInt(st.nextToken());
//        int m=Integer.parseInt(st.nextToken());
//
//        st=new StringTokenizer(br.readLine());
//        array=new int[n+1];
//        for(int i=1;i<=n;i++) { // i까지의 누적합 구하기
//            array[i]=array[i-1]+Integer.parseInt(st.nextToken());
//        }
//
//        for(int i=0;i<m;i++) {
//            st=new StringTokenizer(br.readLine());
//            int a=Integer.parseInt(st.nextToken());
//            int b=Integer.parseInt(st.nextToken());
//            // a, b사이의 구간합은 array[b]-array[a-1]과 같다
//            System.out.println(array[b]-array[a-1]);
//        }
//    }


