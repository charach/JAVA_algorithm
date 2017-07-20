package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e4948 {

    public e4948() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        boolean primeAry[] = new boolean[123456*2+1];
        primeAry[1] = true;
        for(int i=2;i<Math.sqrt(primeAry.length)+1;i++){
            if(primeAry[i] == true)
                continue;
            for(int j=2;j*i<primeAry.length;j++){
                primeAry[i*j] = true;
            }
        }
        int cnt;
        while(true){
            num = Integer.parseInt(br.readLine());
            if(num == 0){
                break;
            }
            cnt = 0;
            for(int i=num+1;i<=num*2;i++){
                if(primeAry[i] == false)
                    cnt++;
            }
            System.out.println(cnt);

        }
    }

    public static void main(String[] args) throws IOException {
        new e4948();
    }

}
