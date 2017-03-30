package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e2579 {
    int length;


    public e2579() throws NumberFormatException, IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         length = Integer.parseInt(br.readLine());

         long[] scoreAry = new long[length];
         long[] dPAry   = new long[length];

         for(int i=0;i<length;i++){
             scoreAry[i] = Long.parseLong(br.readLine());
         }

         dPAry[0] = scoreAry[0];
         dPAry[1] = Math.max(dPAry[0]+scoreAry[1],scoreAry[0]+scoreAry[1]);
         dPAry[2] = Math.max(dPAry[0]+scoreAry[2],scoreAry[1]+scoreAry[2]);

         for(int i=3;i<length;i++){
             dPAry[i] = Math.max(dPAry[i-2]+scoreAry[i],scoreAry[i-1]+dPAry[i-3]+scoreAry[i]);
         }
         System.out.println(dPAry[length-1]);

    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        new e2579();
    }

}
