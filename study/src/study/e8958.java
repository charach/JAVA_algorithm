package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e8958 {

	public e8958() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String strBuf;
		int point;
		int pointTotal;
		while(count-->0){
			strBuf = br.readLine();
			point = 0;
			pointTotal = 0;
			for(int i=0;i<strBuf.length();i++){
				if(strBuf.charAt(i) == 'O'){
					pointTotal += ++point;
				}else{
					point = 0;
				}
			}
			System.out.println(pointTotal);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		new e8958();
	}

}
