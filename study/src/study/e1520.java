package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e1520 {
	int[][] count;
	int[][] ary;
	
	public e1520() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		ary = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
		count = new int[ary.length][ary[0].length];
		
		for(int i=0;i<ary.length;i++){
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<ary[0].length;j++){
				ary[i][j] = Integer.parseInt(st.nextToken());
				count[i][j] = -1;
			}
		}
		
	
		System.out.println(dp(ary.length-1,ary[0].length-1));
		
		
	}
	
	int dp(int i,int j){
		if(i==0 && j==0){
			return count[i][j] = 1;
		}
		if(count[i][j] != -1){
			return count[i][j];
		}
		count[i][j] = 0;
		//상
		if(i-1>= 0 && ary[i][j] < ary[i-1][j]){
			count[i][j] += dp(i-1,j);
		}
		//하
		if(i+1<ary.length && ary[i][j] < ary[i+1][j]){
			count[i][j] += dp(i+1,j);
		}
		//좌
		if(j-1 >= 0 && ary[i][j] < ary[i][j-1]){
			count[i][j] += dp(i,j-1);
		}
		//우
		if(j+1<ary[0].length && ary[i][j] < ary[i][j+1]){
			count[i][j] += dp(i,j+1);
		}
		return count[i][j];
	}

	public static void main(String[] args) throws IOException {
		new e1520();
	}

}
