import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int T, L;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            L = Integer.parseInt(br.readLine());
            int arr[] = new int[L];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0 ; i < L ; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);

            int max = 0;
            for(int i = 2 ; i < L ; i++) {
                int dif = arr[i] - arr[i-2];
                max = Math.max(max, dif);
            }
            max = Math.max(max, arr[1] - arr[0]);
            max = Math.max(max, arr[L-1] - arr[L-2]);
            

            System.out.println(max);
            
        }
    }
}
