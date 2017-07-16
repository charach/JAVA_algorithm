package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e2577 {

	public e2577() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = 1;
		for(int i=0;i<3;i++){
			total *= Integer.parseInt(br.readLine().trim());
		}
		int ary[] = new int[10];
		while(total > 0){
			ary[total%10]++;
			total /= 10;
		}
		for(int i=0;i<10;i++){
			System.out.println(ary[i]);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		new e2577();
	}

}
