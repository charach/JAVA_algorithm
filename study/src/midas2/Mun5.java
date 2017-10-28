package midas2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Mun5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] ary = new int[1000];
		ary[0] = 1;
		ary[1] = 2;
		for(int i=2;i<ary.length;i++){
			ary[i] = ary[i-1] + ary[i-2];
		}
		
		int buf = 0;
		long sum = 1;
		for(int i=0;i<str.length();i++){
			if(i > 0 && str.charAt(i) == '0' && str.charAt(i-1) >= '3'){
				System.out.println(0);
				return;
			}else if(str.charAt(i) >= '3' || str.charAt(i) == '0'){
				sum = (ary[buf] * sum % 1000000);
				buf = 0;
			}else{
				buf++;
			}
		}
		if(buf-1 > 0){
			sum = (ary[buf-1] * sum % 1000000);
		}
		
		System.out.println(sum % 1000000);
		
		
	}
	
}
