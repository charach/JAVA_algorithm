package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e2750 {

	public e2750() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int ary[] = new int[size];
		int temp;
		for(int i=0;i<ary.length;i++){
			ary[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<ary.length;i++){
			for(int j=0;j<ary.length-1-i;j++){
				if(ary[j] > ary[j+1]){
					temp     = ary[j];
					ary[j]   = ary[j+1];
					ary[j+1] = temp;
				}
			}
		}
		
		for(int i=0;i<ary.length;i++){
			System.out.println(ary[i]);
		}
	}

	public static void main(String[] args) throws IOException {
		new e2750();
	}

}
