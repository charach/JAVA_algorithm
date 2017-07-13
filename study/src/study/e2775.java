package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e2775 {

    public e2775() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int ary[][] = new int[15][14];

        for(int j=0;j<14;j++){
            ary[0][j] = (j+1);
        }

        for(int i=1;i<ary.length;i++){
            ary[i][0] = 1;
            for(int j=1;j<14;j++){
                ary[i][j] = ary[i][j-1] + ary[i-1][j];
            }
        }
        int a,b;
        while(cnt-->0){
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
            System.out.println(ary[a][b-1]);
        }

    }

    public static void main(String[] args) throws IOException {
        new e2775();
    }

}
