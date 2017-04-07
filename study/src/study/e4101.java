package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e4101 {

    public e4101() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1,num2;
        StringTokenizer st;
        while(true){
            String str = br.readLine();
            st = new StringTokenizer(str, " ");
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            if(num1 == 0){
                return;
            }
            if(num1 > num2){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new  e4101();

    }

}
