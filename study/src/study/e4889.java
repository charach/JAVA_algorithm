package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class e4889 {


    public e4889() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack;
        String str;
        char strbuf;
        int count;
        int num = 1;
        while(!(str = br.readLine()).contains("-")){
            stack = new Stack<Character>();
            count = 0;


            for(int i=0;i<str.length();i++){
                if(str.charAt(i) == '}' && stack.size() > 0){
                    if(stack.peek() == '{'){
                        stack.pop();
                    }else{
                        stack.push(str.charAt(i));
                    }
                }else{
                    stack.push(str.charAt(i));
                }
            }

            while(stack.size() > 0){
                strbuf = stack.pop();
                if(stack.peek().equals(strbuf)){
                    count += 1;
                }else{
                    count += 2;
                }
                stack.pop();
            }

            System.out.println(num+". "+count);
            num++;

        }


    }

    public static void main(String[] args) throws IOException {
        new e4889();
    }

}
