package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e13460 {
	int depth = 0;
	
	public e13460() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int ary[][] = new int[x][y];
		
		String buf;
		
		int redX,redY,blueX,blueY;
		for(int i=0;i<x;i++){
			buf = br.readLine();
			for(int j=0;j<y;j++){
				if(buf.charAt(j) == '#'){
				//block	
					ary[i][j] = -1;
				}else if(buf.charAt(j) == 'R'){
				//Red
					ary[i][j] = 1;
					redX = i;
					redY = j;
				}else if(buf.charAt(j) == 'B'){
				// Blue
					ary[i][j] = 2;
					blueX = i;
					blueY = j;
				}else if(buf.charAt(j) == 'O'){
				// Goal
					ary[i][j] = 3;
				}else{
					ary[i][j] = 0;
				}
			}
			
		}
		
		
		
	}
	
	public void recursion(int ary[][],int redX,int redY,int blueX,int blueY){
		int aX[] = {-1,0,1,0};
		int aY[] = {0,-1,0,1};
		
		for(int i=0;i<4;i++){
			
		}
		
		
	}
	public static void main(String[] args) throws IOException {
		new e13460();
	}

}
