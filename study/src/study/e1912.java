package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e1912 {
    int size;
    int ary[];
    int dp[];
    int i;
    public e1912() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        ary  = new int[size];
        dp   = new int[size];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        i = 0;
        while(st.hasMoreTokens())
            ary[i++] = Integer.parseInt(st.nextToken());

        System.out.println(dpAry());

    }

    public int dpAry(){
        // init ary
        int max = ary[0];
        dp[0] = ary[0];

        for(i = 1 ; i<size;i++){
            dp[i] = dp[i-1] + ary[i] > ary[i]?dp[i-1]+ary[i] : ary[i];
            max = dp[i] > max?dp[i]:max;
        }

        return max;
    }

    public static void main(String[] args) throws IOException {
        new e1912();
    }

}
