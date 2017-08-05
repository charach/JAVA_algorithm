package codeGround;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxRoad {

	public MaxRoad() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int minAry[];
		int max,size;
		for(int i=1;i<=cnt;i++){
			size = Integer.parseInt(br.readLine());
			max = 210000000;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		new MaxRoad();
	}

}
