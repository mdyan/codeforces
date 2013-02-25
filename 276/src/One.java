import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class One {
    public static void main(String[] args) {
        InputReader ir = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        
        int n = ir.nextInt();
        int k = ir.nextInt();
        int f,t;
        int joy = 0;
        int top = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++) {
            joy = 0;
            f = ir.nextInt();
            t = ir.nextInt();
            
            
            if(t > k) joy = f - t + k;
            else joy = f;
            if(joy > top) { top = joy; }
        }
        out.println(top);
        out.close();
    }
    
    
 
    private static class InputReader {
        BufferedReader br;
        StringTokenizer st;
        
        public InputReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = null;
        }
        
        public String next() {
            try {
                if (st == null || !st.hasMoreTokens()) {
                    st = null;
                    st = new StringTokenizer(br.readLine());
                } 
            } catch (IOException e) {
                e.printStackTrace();
            }
            return st.nextToken();       
                 
        }
        
        public int nextInt() {
            return Integer.parseInt(next());
        }    
    }
}

