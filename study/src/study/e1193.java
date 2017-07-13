package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e1193 {

    public e1193() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if(num==1){
            System.out.println("1/1");
            return;
        }

        int i = 1;
        int sP = 0;
        int a;
        int b;
        for(;num>sP;i++){
            sP +=i;
        }
        i--;
        sP -= (i-1);
        if(i %2 == 1){
            a = i;
            b = 1;
            while(sP <num){
                a--;
                b++;
                sP++;
            }
        }else{
            a = 1;
            b = i;
            while(sP <num){
                a++;
                b--;
                sP++;
            }
        }
        System.out.println(a+"/"+b);
    }

    public static void main(String[] args) throws IOException {
        new e1193();
    }

}
