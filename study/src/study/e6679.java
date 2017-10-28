package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class e6679 {

	public e6679() {
		StringBuilder sb = new StringBuilder();
		
		for(int i=1000;i<=9999;i++){
			if(check(i)){
				sb.append(i+"\n");
			}
		}
		System.out.println(sb.toString());
	}
	
	public boolean check(int num){
		int ary[] = {12,16};
		int sum = 0;
		int sumBuf;
		int numBuf = num;
		
		while(numBuf > 0){
			sum += numBuf % 10;
			numBuf /= 10;
		}
		for(int i=0;i<ary.length;i++){
			numBuf = num;
			sumBuf = 0;
			while(numBuf > 0){
				sumBuf += numBuf % ary[i];
				numBuf /= ary[i];
			}
			
			if(sum != sumBuf){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		new e6679();
	}

}
