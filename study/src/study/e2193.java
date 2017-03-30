package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e2193 {
    int length;
    int count = 0;
    e2193() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        length = Integer.parseInt(br.readLine());

        long ary[][] = new long[length+1][2];
        ary[1][0] = 1;
        ary[1][1] = 1;
        for(int i=2;i<= length; i++){
            ary[i][0] = ary[i-1][0] + ary[i-1][1];
            ary[i][1] = ary[i-1][0];
        }
        System.out.println(ary[length][1]);

    }

    public static void main(String[] args) throws IOException{
        new e2193();
    }
}
