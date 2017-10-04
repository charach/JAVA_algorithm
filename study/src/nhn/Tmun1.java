package nhn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Tmun1 {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int[][] ary = new int[8][8];
		StringTokenizer st;
		Stack<SukNode> stack;
		SukNode nodeBuf;
		boolean flag;
		while(cnt-->0){
			flag = false;
			stack = new Stack<>();
			// 배열초기화
			for(int i=0;i<8;i++){
				st = new StringTokenizer(br.readLine(), " ");
				for(int j=0;j<8;j++){
					ary[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			// 초기 값
			stack.add(new SukNode(0,0));
			
			// 길찾기
			while(!stack.isEmpty()){
				nodeBuf = stack.pop();
				if(nodeBuf.i == 7 && nodeBuf.j == 7){
					flag = true;
					break;
				}
				if(ary[nodeBuf.i][nodeBuf.j] == 1 && nodeBuf.j +1 < 8){
					stack.push(new SukNode(nodeBuf.i,nodeBuf.j+1));
				}else if(ary[nodeBuf.i][nodeBuf.j] == 2 && nodeBuf.i <8){
					stack.push(new SukNode(nodeBuf.i+1,nodeBuf.j));
				}else if(ary[nodeBuf.i][nodeBuf.j] == 3 && nodeBuf.j < 8){
					stack.push(new SukNode(nodeBuf.i,nodeBuf.j+1));
				}else if(ary[nodeBuf.i][nodeBuf.j] == 4 && nodeBuf.i +1 < 8){
					stack.push(new SukNode(nodeBuf.i+1,nodeBuf.j));
				}
			}
			if(flag){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
		
		}
		
		
		br.close();

	}
	
}
class SukNode{
	int i;
	int j;
	public SukNode(int i,int j){
		this.i = i;
		this.j = j;
	}
}