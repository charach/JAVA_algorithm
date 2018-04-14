package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e1546 {
	
	public e1546() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		float max = - 1;
		
		StringTokenizer st = new StringTokenizer(br.readLine(),  " ");
		
		
		float ary[] = new float[size];
		float sum = 0;
		for(int i=0;i<size;i++){
			ary[i] = Float.parseFloat(st.nextToken());
			
			if(ary[i] > max){
				max = ary[i];
			}

		}
		for(int i=0;i<size;i++){
			ary[i] = (ary[i]/max*100);
			sum += ary[i];
		}
		System.out.printf("%.2f",sum/size); 
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		new e1546();
	}
	
}
