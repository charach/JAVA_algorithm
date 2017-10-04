package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e1213 {

	public e1213() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		int[] ary = new int[26];
		int numPos = -1;
		int pos = 0;
		for(int i=0;i<str.length();i++){
			ary[str.charAt(i)-'A']++;
		}
		// 불가능 여부 체크
		for(int i=0;i<ary.length;i++){
			// 짝수 길이 일 경우
			if(str.length() %2 == 0 && ary[i] %2 == 1){
				System.out.println("I'm Sorry Hansoo");
				return;
			}// 홀수 일 경우
			else if(str.length() %2 == 1 && ary[i] %2 == 1){
				if(numPos == -1){
					numPos = i;
					ary[numPos]--;
				}else{
					System.out.println("I'm Sorry Hansoo");
					return;
				}
			}
		}
		
		for(int i=0;i<ary.length;i++){
			for(int j=0; j<ary[i];j+=2){
				sb.insert(pos, (char)('A'+i));
				sb.insert(sb.length()-pos,(char)('A'+i));
				pos++;
			}
		}
		if(numPos != -1){
			sb.insert(pos, (char)('A'+numPos));
		}
			
		
		System.out.println(sb.toString());
	}

	public static void main(String[] args) throws IOException {
		new e1213();
	}

}
