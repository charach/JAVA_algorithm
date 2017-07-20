package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e2581 {

    public e2581() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum  = 0;
        int minPrime = 20000;
        boolean pA[] = new boolean[10001];
        pA[1] = true;
        for(int i=2;i<pA.length;i++){
            if(pA[i] == true)
                continue;
            for(int j=2;j*i<pA.length;j++){
                pA[j*i] = true;
            }
        }
        for(int i=m;i<=n;i++){
            if(pA[i] == false){
                sum+=i;
                minPrime = (minPrime>i?i:minPrime);
            }


        }
        if(sum>0){
            System.out.println(sum);
            System.out.println(minPrime);
        }else{
            System.out.println(-1);
        }

    }

    public static void main(String[] args) throws IOException {
        new e2581();

    }

}
