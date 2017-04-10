package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e11726 {

    int number;
    int dp[];
    public e11726() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        number = Integer.parseInt(br.readLine());
        dp = new int[number];

        if(number == 1 || number == 2){
            System.out.println( number == 1?1:2);
            return;
        }
        dp[0] = 1;
        dp[1] = 2;

        for(int i=2;i<dp.length;i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }

        System.out.println(dp[number-1] % 10007);


    }

    public static void main(String[] args) throws IOException {
        new e11726();
    }

}
