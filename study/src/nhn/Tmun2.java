package nhn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Tmun2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		String buf;
		Stack<Character> stack;
		boolean flag;
		while(cnt-->0){
			stack = new Stack<>();
			buf = br.readLine();
			flag = false;
			
			for(int i=0;i<buf.length();i++){
				if(buf.charAt(i) == ']'){
					if(stack.peek() != '['){
						flag = true;
						break;
					}else{
						stack.pop();
					}
				}else if(buf.charAt(i) == '}'){
					if(stack.peek() != '{'){
						flag = true;
						break;
					}else{
						stack.pop();
					}
				}else if(buf.charAt(i) == ')'){
					if(stack.peek() != '('){
						flag = true;
						break;
					}else{
						stack.pop();
					}
				}else{
					if(buf.charAt(i) == '(' || buf.charAt(i) == '{' || buf.charAt(i) == '['){
						stack.push(buf.charAt(i));
					}
				}
			}
			if(flag || stack.size() > 0){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
		}
		br.close();
	}

}
