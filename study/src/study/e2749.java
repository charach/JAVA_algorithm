package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e2749 {

    public e2749() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long count = Long.parseLong(br.readLine());
        long a   = 0;
        long b   = 1;
        if(count == 1){
            System.out.println(1);
            return;
        }
        count  = count%1500000;
        for(int i=0;i<count;i++){
            if(i%2 == 0){
                a = (a+ b)%1000000;
            }else{
                b = (a+b)%1000000;
            }
        }
        System.out.println(count %2 ==0?a:b);
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        new e2749();
    }
}
