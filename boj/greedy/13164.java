import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int N, K;
    static int[] arr;
    static int[] dif;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[N];
        dif = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1 ; i < N ; i++) {
            dif[i] = arr[i] - arr[i-1];
        }

        Arrays.sort(dif); // 정렬해주기
        int res = 0;
        for(int i = 1 ; i <= N-K ; i++) { // 가장 차이가 많이 나는 K-1만큼의 원소는 더하지 않음 (다른 조로 구성)
            res += dif[i];
        }
        
        System.out.println(res);
        
    }
}
