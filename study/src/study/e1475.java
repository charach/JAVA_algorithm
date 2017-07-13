package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e1475 {

    public e1475() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ary[] = br.readLine().toCharArray();
        int num[] = new int[9];
        int max = 0;
        for(int i=0;i<ary.length;i++)
            num[((int)ary[i]-'0' == 9 ? 6:(int)ary[i]-'0')]++;
        num[6] = (num[6]/2) + (num[6] %2);
        for(int i=0;i<num.length;i++)
            max = max < num[i] ? num[i] : max;
        System.out.println(max);
    }

    public static void main(String[] args) throws IOException {
        new e1475();
    }

}
