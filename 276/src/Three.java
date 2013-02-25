import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;



public class Three {    
    
    private static class Index implements Comparable<Index> {
        int idx;
        int score;
        
        public Index (int i) {
            idx = i;
            score = 0;
        }
        public int compareTo(Index o) {
            if (o.getScore() == this.getScore()) return 0;
            else if(o.getScore() < this.getScore()) return -1;
            else return 1;
        }

        public int getIdx() {
            return idx;
        }
        public int getScore() {
            return score;
        }
        public void incrScore() {
            score++;
        }

    }

    public static void main(String[] args) {
        InputReader ir = new InputReader();
        PrintWriter out = new PrintWriter(System.out);
        

        int n = ir.nextInt(); //n of ints
        int q = ir.nextInt(); //n of quaries
        int low,hi;
        int sum = 0;
        int score;
        
        Index[] idxs = new Index[n]; // indicies by ref count
        Integer[] ns = new Integer[n]; // array
        
        for(int i=0;i<n;i++) {
            ns[i] = ir.nextInt();
            idxs[i] = new Index(i);
        }
        
        for(int i=0;i<q;i++) {
//            System.out.println("doing" + i);
            low = ir.nextInt();
            hi = ir.nextInt();
//            System.out.println("low" + i);
//            System.out.println("hi" + i);
            for(int j=(low-1);j<hi;j++) {
//                System.out.println("changing" + j);
                idxs[j].incrScore();
            }
        }
        
        Arrays.sort(ns, Collections.reverseOrder());
        Arrays.sort(idxs);
        
        for(int i=0;i<idxs.length;i++) {
            score = idxs[i].getScore();
            sum += (score*ns[i]);
            if (score == 0) break;
        }
        
        
        out.println(sum);
        
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

