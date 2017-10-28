package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e14500 {
	int ary[][];
	boolean visit[][];
	int sum = 0;
	int max = -1;
	
	int xAry[] = {1,0,-1,0};
	int yAry[] = {0,1,0,-1};
	public e14500() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),  " ");
		ary = new int[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
		visit = new boolean[ary.length][ary[0].length];
		
		for(int i=0;i<ary.length;i++){
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<ary[i].length;j++){
				ary[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0;i<ary.length;i++){
			for(int j=0;j<ary[i].length;j++){
				sum = 0;
				dp(i,j,0);
				sum = 0;
				excep(i, j);
			}
		}
		System.out.println(max);
		br.close();
	}
	
	public void dp(int x,int y,int depth){
		if(depth == 4){
			if(sum > this.max){
				max = sum;
			}
			return;
		}
		int  xBuf,yBuf;
		
		sum += ary[x][y];
		visit[x][y] = true;
		for(int i=0;i<4;i++){
			xBuf = x+xAry[i];
			yBuf = y+yAry[i];
			
			if(xBuf >= 0 && xBuf<ary.length && yBuf >= 0 && yBuf < ary[0].length && !visit[xBuf][yBuf]){
				dp(xBuf,yBuf,depth+1);
			}
		}
		visit[x][y] = false;
		sum -= ary[x][y];
	}
	
	public void excep(int x,int y){
		int min = 1001;
		int xBuf,yBuf;
		int cnt = 0;
		sum += ary[x][y];
		for(int i=0;i<4;i++){
			xBuf = x + xAry[i];
			yBuf = y + yAry[i];
			if(xBuf >= 0 && xBuf<ary.length && yBuf >= 0 && yBuf < ary[0].length){
				sum += ary[xBuf][yBuf];
				if(min > ary[xBuf][yBuf]){
					min = ary[xBuf][yBuf];
				}
				cnt++;
			}
		}
		if(cnt == 4){
			sum -= min;
			if(sum > max){
				max = sum;
			}
		}else if(cnt == 3){
			if(sum > max){
				max = sum;
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		new e14500();
	}

}
