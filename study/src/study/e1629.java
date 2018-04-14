package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e1629 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		String b = Integer.toBinaryString(Integer.parseInt(st.nextToken()));
		int c = Integer.parseInt(st.nextToken());
		
		if(b == "1"){
			System.out.println(a % c);	
		}else{
			long num = a % c;
			long total = 1;
			if(b.charAt(b.length()-1) == '1'){
				total = num;
			}
			
			
			for(int i = b.length()-2; i>=0; i--){
				num = (num * num) % c;
				if(b.charAt(i) == '1'){
					System.out.println(b);
					total *= num;
				}
			}
			System.out.println(total % c);
		}
		
		

	}

}
