package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e9093 {
    public e9093() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        while(count-->0){
            tokenString(br.readLine());
        }
    }

    public void tokenString(String str){
        StringTokenizer st = new StringTokenizer(str, " ");
        while(st.hasMoreTokens()){
            System.out.print(new StringBuffer(st.nextToken()).reverse()+" ");
        }
    }

    public static void main(String[] args) throws IOException{
        new e9093();
    }
}
