package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class e1937 {
	int ary[][];
	int count[][];
	int x[] = {1,0,-1,0};
	int y[] = {0,1,0,-1};
    
	public e1937() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		
		ary = new int[n][n];
		count = new int[n][n];
		
		for(int i=0;i<n;i++){
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<n;j++){
				ary[i][j] = Integer.parseInt(st.nextToken());
			    count[i][j] = -1;
            }
		}
		
		int max = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				max = Math.max(dp(i,j),max);
			}
		}
		System.out.println(max);
	}
	
	public int dp(int i,int j){
		if(count[i][j] != -1){
            return count[i][j];
        }
		count[i][j] = 1;
        int nextX,nextY;
        int tmp;
        for(int k=0;k<4;k++){

            nextX = i+x[k];
            nextY = j+y[k];

            if(nextX < 0 || nextX >= ary.length || nextY<0 || nextY >= ary.length)
                continue;
            
            if(ary[i][j] < ary[nextX][nextY]){
            	tmp = dp(nextX,nextY)+1;
            	count[i][j] = Math.max(tmp, count[i][j]);
            }

        }
        return count[i][j];
        
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		new e1937();
	}

}
