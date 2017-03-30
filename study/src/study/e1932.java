package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e1932 {
    int ary[];
    int dp[];
    int leftAry[];
    int rightAry[];
    public e1932() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String strbuf;
        StringTokenizer st;
        int aryLoc = 0;
        int leftAryPos= 0 ,rightAryPos = 0;
        ary = new int[(length) * (length+1) / 2];
        dp  = new int[(length) * (length+1) / 2];
        leftAry = new int[length];
        rightAry = new int[length];

        /* init ary*/
        while(length-->0){
            strbuf = br.readLine();
            st = new StringTokenizer(strbuf, " ");
            while(st.hasMoreTokens()){
                ary[aryLoc] = Integer.parseInt(st.nextToken());
                aryLoc++;
            }
        }
        leftAry[0] = rightAry[0] = 1;
        for(int i=1;i<length;i++){
            leftAry[i] = leftAry[i] +i;
            rightAry[i] = rightAry[i] + (i+1);
        }

        dp[0] = ary[0];
        dp[1] = ary[1] + ary[0];
        dp[2] = ary[2] + ary[0];


        for(int i=3;i<dp.length;i++){
            if(leftAry[leftAryPos] == i){
                dp[i] = ary[i] + dp[i-leftAryPos];
                leftAryPos++;
            }else if(rightAry[rightAryPos] == i){
                dp[i] = ary[i] + dp[i-(rightAryPos+1)];
                rightAryPos++;
            }else{
                dp[i] = Math.max(dp[i-(leftAryPos+1)]+ary[i], dp[i-leftAryPos]+ary[i]);
            }

        }

        int max = 0;
        for(int i=dp.length-length;i<dp.length;i++){
            max = Math.max(max, dp[i]);
        }
        System.out.println(dp[dp.length-1]);



    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        new e1932();
    }

}
