package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e5622 {

    public e5622() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char chAry[] = br.readLine().toCharArray();
        int totalTime = 0;
        int buf;
        for(int i=0;i<chAry.length;i++){
            if('A' <=chAry[i] && chAry[i] <= 'C'){
                totalTime += 3;
            }else if('D' <=chAry[i] && chAry[i] <= 'F'){
                totalTime += 4;
            }else if('G' <=chAry[i] && chAry[i] <= 'I'){
                totalTime += 5;
            }else if('J' <=chAry[i] && chAry[i] <= 'L'){
                totalTime += 6;
            }else if('M' <=chAry[i] && chAry[i] <= 'O'){
                totalTime += 7;
            }else if('P' <=chAry[i] && chAry[i] <= 'S'){
                totalTime += 8;
            }else if('T' <=chAry[i] && chAry[i] <= 'V'){
                totalTime += 9;
            }else if('W' <=chAry[i] && chAry[i] <= 'Z'){
                totalTime += 10;
            }
        }
        System.out.println(totalTime);
    }

    public static void main(String[] args) throws IOException {
        new e5622();
    }

}
