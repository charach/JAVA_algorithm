package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e9012 {

    public e9012() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String strBuf;
        char[] stack;
        int stackPoint,i;
        while(count-->0){
            strBuf = br.readLine();
            stack  = new char[51];
            stackPoint = 0;

            for(i=0;i<strBuf.length();i++){
                if(strBuf.charAt(i) == '('){
                    stack[stackPoint++] = '(';
                }else{
                    if(stackPoint != 0 && stack[stackPoint-1] == '('){
                        stack[stackPoint-1] = 0;
                        stackPoint--;
                    }else{
                        break;
                    }

                }
            }
            if(i==strBuf.length() && stackPoint == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        new e9012();
    }

}
