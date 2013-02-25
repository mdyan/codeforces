import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;



public class Four {    

    public static void main(String[] args) {
        InputReader ir = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        

        int l = ir.nextInt(); //n of ints
        int r = ir.nextInt(); //n of quaries
        
        
        int low1,low2;
        int hi1 = 1;
        int hi2 = 2;
        
        for(int i = 1;; i += i*4) { 
            low1 = i;
            if(i >= l) break;
            
        }
        for(int i = 2;; i += i*4) { 
            low2 = i;
            if(i >= l) break;
        }
        
        for(int i = 1;; i += i*4) { 
            
            if(i > r) {
                break;
            }
            hi1 = i;
            
        }
        for(int i = 2;; i += i*4) { 
            
            if(i > r) {
                break;
            }
            hi2 = i;
            
        }
        System.out.println("low1"+low1);
        System.out.println("low2"+low2);
        System.out.println("hi1"+hi1);
        System.out.println("hi2"+hi2);
        out.println(Math.max(low1^hi2, low2^hi1));
        
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

