package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class e1874 {

    public e1874() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int count = Integer.parseInt(br.readLine());
        int num;
        int nextNum = 2;
        stack.push(1);
        StringBuilder str = new StringBuilder("+\n");
        while(count-->0){
            num = Integer.parseInt(br.readLine());
            if(stack.size() > 0 && stack.peek() > num){
                System.out.println("NO");
                return;
            }
            while(stack.size() == 0 || num > stack.peek()){
                stack.push(nextNum++);
                str.append("+\n");
            }
            stack.pop();
            str.append("-\n");
        }
        System.out.println(str);

    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        new e1874();
    }

}
