package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e1010 {
    int[][] combination;
    public e1010() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        combination = new int[30][30];
        StringTokenizer st;
        int m,n;
        int count = Integer.parseInt(br.readLine());

        while(count-->0){
            st = new StringTokenizer(br.readLine(), " ");
            m  = Integer.parseInt(st.nextToken());
            n  = Integer.parseInt(st.nextToken());
            if(m==n){
                System.out.println(1);
            }else if(m == 1){
                System.out.println(n);
            }else{
                initAry(m,n);
                System.out.println(combination[n-1][m-1]);
            }
        }

    }

    public void initAry(int m, int n){
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j)
                    combination[i][j] = 1;
                else if(j==0)
                    combination[i][j] = (i+1);
                else{
                    combination[i][j] = combination[i-1][j] + combination[i-1][j-1];
                }
            }
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        new e1010();
    }

}
