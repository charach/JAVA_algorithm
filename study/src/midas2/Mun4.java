package midas2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Mun4 {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		if(cnt == 1 || cnt == 2){
			System.out.println(cnt);
			return;
		}
		
		long ary[] = new long[100];
		ary[0] = 1;
		ary[1] = 2;
		ary[2] = 3;
		ary[3] = 4;
		ary[4] = 5;
		ary[5] = 6;
		for(int i=6;i<cnt;i++){
			ary[i] = Math.max(Math.max(ary[i-5] * 4, ary[i-4] * 3), ary[i-3] *2);
		}
		System.out.println(ary[cnt-1]);
		
		br.close();
	}
	

}
