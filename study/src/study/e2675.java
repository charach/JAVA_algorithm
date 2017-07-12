package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e2675 {

    public e2675() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int rptCnt;
        StringTokenizer st;
        char charAry[];
        while(cnt-->0){
            st = new StringTokenizer(br.readLine(), " ");
            rptCnt = Integer.parseInt(st.nextToken());
            charAry = st.nextToken().toCharArray();
            for(int i=0;i<charAry.length;i++){
                for(int j=0;j<rptCnt;j++){
                    System.out.print(charAry[i]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        new e2675();
    }

}
