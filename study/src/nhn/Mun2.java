package nhn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mun2 {

	public Mun2() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for(int i=0;i<3;i++){
			if(checkPel(num)){
				System.out.println(num);
				return;
			}else{
				num = num+ Integer.parseInt(new StringBuffer(num+"").reverse().toString());
			}
		}
		System.out.println(-1);
	}
	
	public static boolean checkPel(int num){
		Integer numBuf = num;
		while(numBuf > 9){
			System.out.println(numBuf/numBuf);
			System.out.println(numBuf % 10);
			if(numBuf/10 != numBuf % 10){
				return false;
			}
			numBuf /= 10;
		}
		return true;
	}
}
