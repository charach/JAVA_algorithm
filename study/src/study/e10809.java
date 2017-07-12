package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class e10809 {

    public e10809() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int ary[] = new int[26];
        int location;

        for(int i=0;i<ary.length;i++){
            ary[i] = -1;
        }

        for(int i=0;i<str.length();i++){
            location = (int)str.charAt(i)-97;
            if(ary[location] != -1)
                continue;
            else
                ary[location] = i;
        }
        for(int i=0;i<ary.length;i++){
            System.out.print(ary[i]+" ");
        }
    }

    public static void main(String[] args) throws IOException {
        new e10809();
    }

}
