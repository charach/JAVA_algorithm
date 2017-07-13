package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e10250 {

    public e10250() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int w,h,num;
        StringTokenizer st;
        while(cnt-->0){
            st = new StringTokenizer(br.readLine(), " ");
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            num = Integer.parseInt(st.nextToken());
            System.out.println(((num%h != 0)?num%h:h)+""+(((num-1)/h)+1 >=10 ? ((num-1)/h)+1:"0"+(((num-1)/h)+1)));

        }


    }

    public static void main(String[] args) throws IOException{
        new e10250();
    }

}
