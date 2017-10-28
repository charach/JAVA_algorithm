package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e14888 {
	
	int min = 1000000001;
	int max = -1000000001;
	int sum = 0;
	
	int[] numAry;
	int[] op;
	
	public e14888() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		numAry = new int[n];
		op = new int[4];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0;i<n;i++){
			numAry[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(),  " ");
		
		for(int i=0;i<4;i++){
			op[i] = Integer.parseInt(st.nextToken());
		}
		
		sum = numAry[0];
		dic(1);
		System.out.println(max);
		System.out.println(min);
		
	}
	
	public void dic(int depth){
		int sumBuf = sum;
		if(depth == numAry.length-1){
			if(op[0] > 0){
				sum += numAry[depth];
			}else if(op[1] > 0){
				sum -= numAry[depth];
			}else if(op[2] > 0){
				sum *= numAry[depth];
			}else{
				sum /= numAry[depth];
			}
			
			if(sum < min){
				min = sum;
			}
			
			if(sum > max){
				max = sum;
			}
			
			sum = sumBuf;
		}else{
			
			if(op[0] > 0){
				op[0]--;
				sum += numAry[depth];
				dic(depth+1);
				sum = sumBuf;
				op[0]++;
			}
			
			if(op[1] > 0){
				op[1]--;
				sum -= numAry[depth];
				dic(depth+1);
				sum = sumBuf;
				op[1]++;
			}
			
			if(op[2] > 0){
				op[2]--;
				sum *= numAry[depth];
				dic(depth+1);
				sum = sumBuf;
				op[2]++;
			}
			
			if(op[3] > 0){
				op[3]--;
				sum /= numAry[depth];
				dic(depth+1);
				sum = sumBuf;
				op[3]++;
			}
			
		}
	}
	
	public static void main(String[] args) throws IOException{
		new e14888();
	}
}
