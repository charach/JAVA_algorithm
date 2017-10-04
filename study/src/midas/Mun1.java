package midas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mun1 {

	public Mun1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		boolean[][] ary = new boolean[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
		int cnt = Integer.parseInt(st.nextToken());
		
		if(cnt == 0){
			System.out.println(ary.length* ary[0].length);
			return;
		}
		
		int r,c1,c2;
		int total = 0;
		
		while(cnt-->0){
			st = new StringTokenizer(br.readLine(), " ");
			r = Integer.parseInt(st.nextToken())-1;
			c1 = Integer.parseInt(st.nextToken())-1;
			c2 = Integer.parseInt(st.nextToken())-1;
			
			while(c1<=c2){
				ary[r][c1] = true;
				c1++;
			}
		}
		
		for(int i=0;i<ary.length;i++){
			for(int j=0;j<ary[0].length;j++){
				if(ary[i][j] == false){
					total++;
				}
			}
		}
		
		System.out.println(total);
		br.close();
	}

}
