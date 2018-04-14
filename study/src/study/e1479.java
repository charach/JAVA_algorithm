package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class e1479 {
	
	boolean[] strAry;
	
	String str;
	String[] ary;
	
	int min = 9999999;
	int max = -1;
	
	public e1479() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		str = br.readLine();
		ary = new String[4];
		
		for(int i=0;i<4;i++){
			ary[i] = br.readLine();
		}
		
		strAry = new boolean[str.length()];
		
		for(int i=0;i<strAry.length;i++){
			strAry[i] = true;
		}
		
		recu(0);
		
		System.out.println(min+" "+max);
	}
	
	public void recu(int depth){
		int[] indexAry = findIndex(str,ary[depth]);
		
		if(depth == 3){
			for(int i=0;indexAry[i] != -1;i++){
				
				for(int j=indexAry[i];j<indexAry[i]+ary[depth].length();j++){
					strAry[j] = false;
				}
				
				int num = 0;
				for(int j=0;j<strAry.length;j++){
					if(!strAry[j]){
						num++;
					}
				}
				
				for(int j=indexAry[i];j<indexAry[i]+ary[depth].length();j++){
					strAry[j] = true;
				}
				
				if(num < min){
					min = num;
				}
				
				if(num > max){
					max = num;
				}
			}
			
			
			
		}else{
			for(int i=0;indexAry[i] != -1;i++){
				
				for(int j=indexAry[i];j<indexAry[i]+ary[depth].length();j++){
					strAry[j] = false;
				}
				
				recu(depth+1);
				
				for(int j=indexAry[i];j<indexAry[i]+ary[depth].length();j++){
					strAry[j] = true;
				}
			}
			
		}
	}
	
	public int[] findIndex(String str,String subStr){
		int[] ary = new int[20];
		int i = 0;
		int j = 0;
		ary[0] = -1;
		while(str.indexOf(subStr, i) != -1){
			ary[j] = str.indexOf(subStr, i);
			if(ary[j] == 0){
				i++;
			}else{
				i = ary[j]+1;
			}
			j++;
		}
		ary[j] = -1;
		return ary;
	}
	
	public static void main(String[] args) throws IOException {
		new e1479();
	}

}
