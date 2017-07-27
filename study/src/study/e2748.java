package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e2748 {

    public e2748() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        long a   = 0;
        long b   = 1;
        if(count == 1){
            System.out.println(1);
            return;
        }
        for(int i=0;i<count;i++){
            if(i%2 == 0){
                a +=b;
            }else{
                b +=a;
            }
        }
        System.out.println(count %2 ==0?a:b);
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        new e2748();
    }
}
