package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e10039 {

	public e10039() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = 0;
		int intBuf;
		for(int i=0;i<5;i++){
			intBuf = Integer.parseInt(br.readLine());
			total += intBuf <40 ? 40:intBuf;
		}
		System.out.println(total/5);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		new e10039();
	}

}
