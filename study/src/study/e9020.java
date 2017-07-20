package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e9020 {

    public e9020() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        boolean primeAry[] = new boolean[10000];
        primeAry[1] = true;
        for(int i=2;i<Math.sqrt(primeAry.length);i++){
            if(primeAry[i] == true)
                continue;
            for(int j=2;j*i<primeAry.length;j++){
                primeAry[i*j] = true;
            }
        }
        int num;
        int a=0,b=0,minDif;
        while(count-->0){
            num = Integer.parseInt(br.readLine());
            minDif = 20000;
            for(int i=num-1;i>=num/2;i--){
                if(primeAry[i] == false && primeAry[num-i] == false && 2*i-num <minDif){
                    a = i;
                    b = num-i;
                    minDif = 2*i-num;
                }
            }
            System.out.println(b+" "+a);
        }
    }

    public static void main(String[] args) throws IOException {
        new e9020();
    }

}
