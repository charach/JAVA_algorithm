package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e1011 {

    public e1011() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st;
        long dis;
        int cnt;
        long numBuf;
        while(count-->0){
            st = new StringTokenizer(br.readLine(), " ");
            dis = (Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()))* -1;
            numBuf = 0;
            cnt = 0;
            for(int i=1;;i++){
                numBuf += i*2;
                if(numBuf >= dis){
                    cnt = i;
                    break;
                }
            }
            System.out.println(numBuf -cnt>=dis?cnt*2-1:cnt*2);
        }
    }

    public static void main(String[] args) throws IOException {
        new e1011();
    }

}
