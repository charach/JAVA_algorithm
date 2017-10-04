package nhnTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mun2 {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String op = st.nextToken();
		String key,value;
		int rotate;
		
		key = st.nextToken();
		rotate = Integer.parseInt(st.nextToken());
		value = st.nextToken();
		char buf;
		StringBuilder result;
		if(op.equals("encrypt")){
			result = new StringBuilder();
			for(int i=0;i<key.length();i++){
				buf = (char) (key.charAt(i)+value.charAt(i));
				if(buf - 'a' > 122){
					buf = (char)(buf - 'z' -1);
				}else{
					buf = (char)(buf - 'a');
				}
				result.append(buf);
			}
			for(int i=0;i<rotate;i++){
				result.append(result.substring(0, 1));
				result.delete(0, 1);
			}
			System.out.println(result.toString());
		}
		
		else{
			result = new StringBuilder(value);
			int length = result.length();
			for(int i=0;i<rotate;i++){
				buf = result.substring(length-1, length).charAt(0);
				result.insert(0, buf);
				result.delete(length, length+1);
			}
			for(int i=0;i<key.length();i++){
				if(key.charAt(i) < result.charAt(i)){
					buf = (char)(result.charAt(i) - key.charAt(i) +'a');
				}else{
					buf = (char)('z'-key.charAt(i) + result.charAt(i) +1);
				}
				result.replace(i, i+1, buf+"");
			}
			
			System.out.println(result.toString());
		}
		
	}
}
