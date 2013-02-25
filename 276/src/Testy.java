import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Testy {
    public static void main(String[] args) {
        InputReader ir = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        
        int n = ir.nextInt();
        int s;
        int tot = 0;
        for(int i=0;i<n;i++){
            s = 0;
            for(int j=0;j<3;j++) {
                s += ir.nextInt();
            }
            if(s >= 2) tot++;
        }
        out.println(tot);
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

