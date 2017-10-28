package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e11403 {
	int ary[][];
	public e11403() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ary = new int[n][n];
		
		StringTokenizer st;
		for(int i=0;i<n;i++){
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<n;j++){
				ary[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int k=0;k<n;k++){
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(ary[i][k] == 1 && ary[k][j] == 1){
						ary[i][j] = 1;
					}
				}
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(ary[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	public void dp(int i,int j){
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		new e11403();
	}

}
