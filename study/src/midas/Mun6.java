package midas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Mun6 {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int[] ary = new int[size];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0;i<ary.length;i++){
			ary[i] = Integer.parseInt(st.nextToken());
			dp(ary,i);
		}
		
		
		System.out.println(ary[ary.length-1]);
		
		br.close();
	}
	public static void dp(int ary[],int max){
		if(max == 0){
			return;
		}else if(max == 1){
			ary[1] = ary[0] *2 > ary[1]? ary[0]*2 : ary[1];
			return;
		}
		
		int profit = ary[max];
		for(int i=0;i<max/2;i++){
			profit = profit > ary[i]+ ary[max-1-i] ? profit :  ary[i]+ ary[max-1-i];
		}
		if(max%2 == 1){
			profit = profit > ary[max/2] *2 ? profit : ary[max/2] *2;
		}
		ary[max] = profit;
		
	}
}
