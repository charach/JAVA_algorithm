package midas2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Mun6 {
	static int n;
	static int m;
	static int count = 0;
	static int ary[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		ary = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		
		
		for(int i=0;i<n;i++){
			ary[i] = Integer.parseInt(st.nextToken());
			if(ary[i] % m ==0){
				count++;
			}
		}
		
		
		
		System.out.println(count);
	}
	

}
