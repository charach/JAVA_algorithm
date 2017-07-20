package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e1929 {

    public e1929() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[] ary = new boolean[1000001];
        ary[1] = true;
        for(int i=2;i<ary.length;i++){
            if(ary[i] == true)
                continue;
            for(int j=2;j*i<ary.length;j++)
                ary[i*j] = true;
        }
        for(int i=m;i<=n;i++){
            if(ary[i] == false)
                System.out.println(i);
        }

    }

    public static void main(String[] args) throws IOException {
        new e1929();
    }

}
