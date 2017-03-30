package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e9095 {
    int ary[] = new int[13];
    public e9095() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        initAry();

        while(count-->0){
            System.out.println(ary[Integer.parseInt(br.readLine())]);
        }
    }
    public void initAry(){
        ary[1] = 1;
        ary[2] = 2;
        ary[3] = 4;
        for(int i=4;i<ary.length;i++){
            ary[i] = ary[i-3] + ary[i-2] + ary[i-1];
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        new e9095();
    }

}
