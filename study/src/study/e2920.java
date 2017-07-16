package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e2920 {

	public e2920() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// ascend = 0 , descend = 1 mixed = 2;
		int op = 0;
		int intBuf,intBuff;
		intBuf = Integer.parseInt(st.nextToken());
		intBuff = Integer.parseInt(st.nextToken());
		if(intBuf > intBuff){
			op = 1;
		}
		while(st.hasMoreTokens()){
			intBuf = Integer.parseInt(st.nextToken());
			if(op == 0 && intBuf < intBuff){
				op = 2;
				break;
			}else if(op == 1 && intBuf > intBuff){
				op = 2;
				break;
			}
			intBuff = intBuf;
		}
		if(op == 0){
			System.out.println("ascending");
		}else if(op == 1){
			System.out.println("descending");
		}else{
			System.out.println("mixed");
		}
		
	}

	public static void main(String[] args) throws IOException {
		new e2920();
	}

}
