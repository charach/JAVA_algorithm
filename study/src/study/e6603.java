package study;

import java.util.Scanner;
import java.util.Stack;

public class e6603 {
	public static void DFS(int[] ary,Stack<Integer> stack,int from){
		if(stack.size() == 6){
			for(int i=0;i<6;i++){
				System.out.print(stack.elementAt(i)+" ");
			}
			System.out.println("from"+ from);
			return;
		}
		else{
			for(int i=from+1;i<ary.length;i++){
				stack.push(ary[i]);
				DFS(ary,stack,i);
				stack.pop();
			}
		}
	}
	
	public static void main(String[] args){
		int length = 1;
		int ary[];
		Stack<Integer> stack = new Stack();
		Scanner sc = new Scanner(System.in);
		length = sc.nextInt();
		
		while(length != 0){
			ary = new int[length];
			for(int i=0;i<length;i++){
				ary[i] = sc.nextInt();
			}
			for(int i=0;length - i >=6;i++){
				stack.push(ary[i]);
				DFS(ary,stack,i);
				stack.pop();
			}
			
			System.out.println();
			length = sc.nextInt();
			
		}
	}
}
