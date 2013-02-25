import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Two {
    public static void main(String[] args) {
        InputReader ir = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        String[] ppl = {"First", "Second"};
        
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        int l;
        Integer n = 0;
        
        int evens = 0;
        int odds = 0;
        Character c;
        
        String s = ir.next();
        
        l = s.length();
//        System.out.println(l);
        
        for(int i=0; i<l; i++) {
            c = s.charAt(i);
            n = map.get(c);
            if(n == null) map.put(c, 1);
            else map.put(c, n+1);
        }
        
        for(Integer i : map.values()) {
            if(i % 2 == 0) evens++;
            else odds++;
        }
        
        
        if(odds > 1) {
            out.println(ppl[ (odds+1) % 2 ]);
        } else {
            out.println(ppl[0]);
        }
        
//        out.println("evens:" + evens);
//        out.println("odds:" + evens);
        out.close();
        
        // can't rearrange

        
        
        
        
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

