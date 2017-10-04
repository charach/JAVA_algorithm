package midas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mun2 {

	public Mun2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		String buf;
		int total;
		while(cnt-->0){
			total = 0;
			buf = br.readLine();
			for(int i=0;i<buf.length()/2;i++){
				if(!(buf.charAt(i) == buf.charAt(buf.length()-1-i))){
					total += Math.abs((buf.charAt(i) - buf.charAt(buf.length()-1-i)));
				}
			}
			System.out.println(total);
		}
		
		br.close();
	}

}
