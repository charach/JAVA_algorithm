package nhn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Tmun6 {
	public static void main(String[] args) throws IOException {
		int ary[][] = new int[10][10];
		
		int a,b,c,d;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 초기화
		for(int i=0;i<10;i++){
			st = new  StringTokenizer(br.readLine(), " ");
			for(int j=0;j<10;j++){
				ary[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int cnt = Integer.parseInt(br.readLine());
		
		boolean flag;
		while(cnt-->0){
			flag = false;
			
			st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine(), " ");
			c = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());
			if(a==b && c==d){
				System.out.println("YES");
				continue;
			}
			int aryCopy[][] = ary.clone();
			
			if(a == c){
				//좌
				for(int i=b;i<aryCopy[0].length;i++){
					if(!(aryCopy[a][i] == 0)){
						break;
					}
					if(i == d){
						flag = true;
						break;
					}
				}
				if(!flag){
				
					//우
					for(int i=b;i>=0;i--){
						if(!(aryCopy[a][i] == 0)){
							break;
						}
						if(i == d){
							flag = true;
							break;
						}
					}
					
				}
				
			}
			if(!flag && b == d){
				//상
				for(int i=a;i<aryCopy[0].length;i++){
					if(!(aryCopy[i][b] == 0)){
						break;
					}
					if(i == c){
						flag = true;
						break;
					}
				}
				if(!flag){
					//하
					for(int i=d;i>=0;i--){
						if(!(aryCopy[i][b] == 0)){
							break;
						}
						if(i == c){
							flag = true;
							break;
						}
					}	
				}
			}
			
			//2번 꺽기
			
			//상좌
			if(!flag){ 	
				
			}
			//상우
			if(!flag){
				
			}
			//하좌
			
			//하우
			
			//좌상
			
			//좌하
			
			//우상
			
			//우하
			
		}
	}

}