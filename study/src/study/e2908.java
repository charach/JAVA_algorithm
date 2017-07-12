package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import sun.util.locale.StringTokenIterator;

public class e2908 {

    public e2908() throws IOException {
        int A,B;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        A = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
        B = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
        System.out.println(A>B?A:B);
    }
    public static void main(String[] args) throws IOException{
        new e2908();
    }

}
