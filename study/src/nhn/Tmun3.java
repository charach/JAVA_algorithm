package nhn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Tmun3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		String buf;
		Stack<Character> stack;
		//괄호 성공 유무
		boolean flag;
		//괄호가 하나라도 닫힌게 있는지 검사
		int pos;
		int depth;
		while(cnt-->0){
			stack = new Stack<>();
			buf = br.readLine();
			buf = buf.trim();
			flag = false;
			int ary[] = new int[buf.length()];
			pos = 0;
			depth = 0;
			for(int i=0;i<buf.length();i++){
				if(buf.charAt(i) == ']'){
					if(stack.peek() != '['){
						flag = true;
						pos = i;
						break;
					}else{
						depth--;
						ary[i] = depth;
						stack.pop();
					}
				}else if(buf.charAt(i) == '}'){
					if(stack.peek() != '{'){
						flag = true;
						pos = i;
						break;
					}else{
						depth--;
						ary[i] = depth;
						stack.pop();
					}
				}else if(buf.charAt(i) == ')'){
					if(stack.peek() != '('){
						flag = true;
						pos = i;
						break;
					}else{
						depth--;
						ary[i] = depth;
						stack.pop();
					}
				}else{
					if(buf.charAt(i) == '(' || buf.charAt(i) == '{' || buf.charAt(i) == '['){
						stack.push(buf.charAt(i));
						ary[i] = depth;
						depth++;
					}else{
						ary[i] = depth;
					}
				}
			}
			if(flag || stack.size() > 0){
				if(!checkString(buf)){
					System.out.println(-1);
				}else{
					System.out.println(pos);	
				}
			}else{
				for(int i=0;i<ary.length;i++){
					System.out.print(ary[i]+" ");
				}
				System.out.println();
			}
		}
		br.close();
	}
	
	public static boolean checkString(String str){
		if(str.contains("{") && str.contains("}")){
			return true;
		}else if(str.contains("[") && str.contains("]")){
			return true;
		}else if(str.contains("(") && str.contains(")")){
			return true;
		}
		return false;

	}
}
