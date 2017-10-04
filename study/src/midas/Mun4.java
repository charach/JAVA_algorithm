package midas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Mun4 {

	public Mun4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		int numBuf,numBuff;
		int gcd = 200000000;
		int gcdBuf;
		int total = 0;
		numBuf = Integer.parseInt(br.readLine());
		while(cnt-->1){
			numBuff = Integer.parseInt(br.readLine());
			list.add(Math.abs(numBuf - numBuff));
			numBuf = numBuff;
			
		}
		
		Collections.sort(list);
		gcd = gcd(list.get(0),list.get(1));
		for(int i=2;i<list.size();i++){
			gcd = gcd(gcd,list.get(i));
		}
		
		for(int i=0;i<list.size();i++){
			total += list.get(i)/gcd -1;
		}
		System.out.println(total);
		
		br.close();
	}
	
	public static int gcd(int a, int b) {
	    while (b != 0) {
	      int temp = a % b;
	      a = b;
	      b = temp;
	    }
	    return Math.abs(a);
	}

}
