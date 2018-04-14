package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e10872 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if(n<=2){
			System.out.println(n == 0? 1 : n);
		}else{
			
			long total = 1;
			for(int i=2;i<=n;i++){
				total *= i;
			}
			System.out.println(total);
			
		}
	}

}
