package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e3671 {
	boolean ary[] = new boolean[10000000];
	String buf = ""; 	
	int numAry[];	
	
	public e3671() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ary[0] = ary[1] = true;
		int j;
		
		for(int i=2;i<ary.length;i++){
			if(!ary[i]){
				j =2;
				while(i*j < ary.length){
					ary[i*j] = true;
					j++;
				}
			}
		}
		
		int n = Integer.parseInt(br.readLine());
		int cnt;
		while(n-->0){
			cnt = 0;
			buf = br.readLine();
			numAry = new int[10];
			
			for(int i=0;i<buf.length();i++){
				numAry[Character.getNumericValue(buf.charAt(i))]++;
			}
			
			int sum = 0;
			for(int i=1;i<numAry.length;i++){
				if(numAry[i] > 0 && !ary[i]){
					sum++;
				}
				if(numAry[i] != 0){
					numAry[i]--;
					sum += checkNum(i,1);
					numAry[i]++;
				}
			}
			System.out.println(sum);
		}
		
		br.close();
	}
	
	public int checkNum(int num,int depth){
		if(depth == buf.length()){
			return 0;
		}else{
			int sum = 0;
			for(int i=0;i<numAry.length;i++){
				if(numAry[i] > 0){
					if(!ary[num * 10 + i]){
						sum++;
					}
					numAry[i]--;
					sum += checkNum(num*10 + i,depth+1);
					numAry[i]++;
				}
			}
			return sum;
		}
	}
	
	public static void main(String[] args) throws IOException {
		new e3671();
	}

}
