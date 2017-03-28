package study;

import java.util.Scanner;

public class e2292 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 1;
        int numBuf = 1;
        while(numBuf < num){
            numBuf += 6*cnt;
            cnt++;
        }
        System.out.println(cnt);

    }

}
