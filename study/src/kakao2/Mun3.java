package kakao2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mun3 {
	static int counting(String s) {
		int num = 0;
		int op = s.charAt(0);
		int length;
		for(int i=0;i<s.length();){
			length = 1;
			while(i < s.length() && s.charAt(i) == op){
				i++;
				length++;
			}
			if(i >= s.length()){
				break;
			}
			op = s.charAt(i);
			if(length > 2){
				System.out.println("hihi");
				num += 2;
			}else{
				num++;
			}
		}
		return num;
	}
	public Mun3() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(counting(br.readLine()));
	}

	public static void main(String[] args) throws IOException {
		new Mun3();

	}

}
