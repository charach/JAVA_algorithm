package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e2156 {
    int[] ary;
    int[] dAry;
    int length;
    public e2156() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        length = Integer.parseInt(br.readLine());
        ary = new int[length+1];
        dAry = new int[length+1];
        for(int i=1;i<=length;i++){
            ary[i] = Integer.parseInt(br.readLine());
        }
        if(length == 1)
            System.out.println(ary[1]);
        else if(length == 2)
            System.out.println(ary[1]+ary[2]);
        else
            dinamic();

        br.close();
    }
    void dinamic(){
        //init dinamic Ary
        dAry[1] = ary[1];
        dAry[2] = ary[1] + ary[2];
        for(int i=3;i<=this.length;i++){
            dAry[i] = Math.max(ary[i-1]+dAry[i-3],dAry[i-2])+ary[i];
            dAry[i] = Math.max(dAry[i], dAry[i-1]);
        }
        System.out.println(dAry[length]);
    }
    public static void main(String[] args) throws IOException {
        new e2156();
    }

}
