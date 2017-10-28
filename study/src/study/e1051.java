package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class e1051 {

	public e1051() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String buf;
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int[][] ary = new int[n][m];
		
		int max = -1;
		
		int hori;
		
		for(int i=0;i<n;i++){
			buf = br.readLine();
			for(int j=0;j<m;j++){
				ary[i][j] = Character.getNumericValue(buf.charAt(j));
			}
		}
		
		
		ArrayList<Integer> list;
		Iterator<Integer> iterator;
	
		for(int i=0;i<n-1;i++){
			for(int j=0;j<m;j++){
				
				hori = 0;
				
				list = find(ary,i,j);
				
				if(list.isEmpty()){
					continue;
				}
				
				iterator = list.iterator();
				
				while(iterator.hasNext()){
					hori = iterator.next()-j;
					if(hori+i >= n || hori + j >= m){
						continue;
					}
					
					if(ary[i][j] == ary[i+hori][j] && ary[i][j] == ary[i+hori][j+hori]){
						max = max > (hori+1)*(hori+1)? max : (hori+1)*(hori+1);
					}
				}
				
			}
		}
		
		System.out.println(max == -1? 1: max);
		br.close();
	}
	
	
	public ArrayList<Integer> find(int ary[][],int x,int y){
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=y+1;i<ary[0].length;i++){
			if(ary[x][y] == ary[x][i]){
				list.add(i);
			}
		}
		
		return list;
	}
	public static void main(String[] args) throws IOException {
		new e1051();
	}

}
