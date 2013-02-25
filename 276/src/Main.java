import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        InputReader ir = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        
        
        System.out.println("herp");
    }
}

class InputReader {
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
