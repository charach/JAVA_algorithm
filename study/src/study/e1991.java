package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e1991 {
	static final int NOELEMENT = 30;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());		
		int[][] ary = new int[size][2];
		char chbuf;
		
		for(int i=0;i<size;i++){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int pos = st.nextToken().charAt(0) - 'A';
			
			
			for(int j=0;j<2;j++){
				chbuf = st.nextToken().charAt(0);
				if(chbuf != '.'){
					ary[pos][j] = chbuf-'A';
				}else{
					ary[pos][j] = NOELEMENT;
				}
			}
		}
		preorder(ary,0);
		System.out.println();
		
		inorder(ary,0);
		
		System.out.println();
		postorder(ary,0);
		
	}
	
	static void preorder(int[][] ary,int i){
		System.out.print((char)('A'+i));
		
		if(ary[i][0] != NOELEMENT){
			preorder(ary,ary[i][0]);
		}
		
		if(ary[i][1] != NOELEMENT){
			preorder(ary,ary[i][1]);
		}
		
		
	}
	
	static void inorder(int[][] ary,int i){
		if(ary[i][0] != NOELEMENT){
			inorder(ary,ary[i][0]);
		}

		System.out.print((char)('A'+i));
		
		if(ary[i][1] != NOELEMENT){
		
			inorder(ary,ary[i][1]);
		}
	}
	
	static void postorder(int[][] ary,int i){
		if(ary[i][0] != NOELEMENT){
			postorder(ary,ary[i][0]);
		}
		
		if(ary[i][1] != NOELEMENT){
			postorder(ary,ary[i][1]);
		}
		
		System.out.print((char)('A'+i));
	}

}
