package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e1932 {
    int ary[];
    int leftAry[];
    int rightAry[];
    int height;
    int arySize;

    int dp[];
    int heightPos;
    int max;

    e1932() throws IOException{
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));

        height = Integer.parseInt(br.readLine());
        arySize = (height%2 == 0? (height/2)*(height+1) : (height+1)/2 * (height));
        ary = new int[arySize];
        dp = new int[arySize];
        leftAry = new int[height];
        rightAry = new int[height];

        StringTokenizer st;
        int aryIndex=0;

        for(int i=0;i<height;i++){
            st = new StringTokenizer(br.readLine(), " ");
            while(st.hasMoreTokens()){
                ary[aryIndex++] = Integer.parseInt(st.nextToken());
            }
        }


        leftAry[0] = 1;
        rightAry[0] = 2;
        for(int i=1;i<height;i++){
            leftAry[i] = (i+1) + (leftAry[i-1]);
            rightAry[i] = (i+2) + (rightAry[i-1]);
        }

        dp[0] = ary[0];
        max = dp[0];
        heightPos = 0;

        for(int i=1;i<arySize;i++){
            if(i == leftAry[heightPos]){
                dp[i] = ary[i] + dp[i-(heightPos+1)];
            }else if(i == rightAry[heightPos]){
                dp[i] = ary[i] + dp[i-(heightPos+2)];
                heightPos++;
            }
            else{
                dp[i] = Math.max(dp[i-(heightPos+1)], dp[i-(heightPos+2)])+ary[i];
            }

            max =( max>dp[i]? max : dp[i]);

        }
        System.out.println(max);



    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        new e1932();
    }

}
