import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static String L, R;
    static int cnt = 0;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        L = st.nextToken();
        R = st.nextToken();

        if(L.length() != R.length()) System.out.println(0);
        else {
            for(int i = 0 ; i < L.length() ; i++) {
                if(L.charAt(i) == R.charAt(i)) { 
                    if(L.charAt(i) == '8') {
                        cnt++;
                    }
                } else {
                    break;
                }
            } 
            System.out.println(cnt);
        }

        

    }
}
