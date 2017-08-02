package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e2965 {

    public e2965() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int ary[] = new int[3];
        for(int i=0;i<ary.length;i++){
            ary[i] = Integer.parseInt(st.nextToken());
        }
        if(ary[1] - ary[0] > ary[2] - ary[1]){
            System.out.println(ary[1]-ary[0]-1);
        }else{
            System.out.println(ary[2] - ary[1]-1);
        }
    }

    public static void main(String[] args) throws IOException {
        new e2965();
    }

}
