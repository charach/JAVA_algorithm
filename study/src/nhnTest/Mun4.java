package nhnTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Mun4 {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int ary[][] = new int[size][size];
		int cnt = 0;
		ArrayList<Integer> list = new ArrayList<>();
		StringTokenizer st;
		for(int i=0;i<size;i++){
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<size;j++){
				ary[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(ary[i][j] == 1){
					list.add(check(ary,i,j));
					cnt++;
				}
			}
		}
		if(list.isEmpty()){
			System.out.println(0);
		}else{
			System.out.println(cnt);
			Collections.sort(list);
			Iterator iterator = list.iterator();
			while(iterator.hasNext()){
				System.out.print(iterator.next()+" ");
			}
		}
		br.close();
	}
	
	
	public static int check(int[][] ary,int i,int j){
		int location = 1;
		ary[i][j] = 0;
		if(i -1 >= 0 && ary[i-1][j] == 1){
			location += check(ary,i-1,j);
		}
		//하
		if(i +1 < ary.length && ary[i+1][j] == 1){
			location += check(ary,i+1,j);
		}
		
		//좌
		if(j -1 >= 0 && ary[i][j-1] == 1){
			location += check(ary,i,j-1);
		}
		
		//우
		if(j + 1 < ary.length && ary[i][j+1] == 1){
			location += check(ary,i,j+1);
		}
		return location;
	}
}
