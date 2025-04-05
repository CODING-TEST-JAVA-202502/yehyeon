import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static char[] quack = {'q', 'u', 'a', 'c', 'k'};
    static int cnt = 0;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        int l = arr.length;
        boolean[] check = new boolean[l];
        while(l > 0) {
            int idx = 0, tmp = 0;
            for(int i = 0 ; i < arr.length ; i++) {
                if(!check[i] && arr[i] == quack[idx]) {
                    check[i] = true;
                    idx = (idx + 1) % 5;
                    tmp++;
                }
            }
            
            if(tmp != 0 && tmp % 5 == 0) {
                l -= tmp;
                cnt++;
            } else {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(cnt); 
    }
}
