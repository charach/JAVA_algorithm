package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e3090 {

    public e3090() throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(br.readLine()," ");
         int n  = Integer.parseInt(st.nextToken());
         int t  = Integer.parseInt(st.nextToken());
         int[] ary = new int[n];
         st = new StringTokenizer(br.readLine()," ");
         for(int i=0;i<n;i++){
             ary[i] = Integer.parseInt(st.nextToken());
         }


    }

    public static void main(String[] args) throws IOException {
        new e3090();
    }

}
