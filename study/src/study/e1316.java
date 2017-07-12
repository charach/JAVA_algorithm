package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e1316 {

    public e1316() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int total = 0;
        int i;
        boolean chkAry[];
        char chAry[];
        char prev;
        while(cnt-->0){
            chkAry = new boolean[26];
            chAry = br.readLine().toCharArray();

            prev = chAry[0];
            chkAry[(int)chAry[0]-97] = true;
            for(i=1;i<chAry.length;i++){
                if(prev != chAry[i] && chkAry[(int)chAry[i]-97] == true)
                    break;
                chkAry[(int)chAry[i]-97] = true;
                prev = chAry[i];
            }
            if( i == chAry.length){
                total++;
            }
        }
        System.out.println(total);
    }

    public static void main(String[] args) throws IOException {
        new e1316();
    }

}
