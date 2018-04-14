package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e10871 {

	public e10871() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int cnt;
		
		while(st.hasMoreTokens()){
			cnt = Integer.parseInt(st.nextToken());
			
			if(cnt < x){
				sb.append(cnt+" ");
			}
		}
		
		System.out.println(sb.toString());
	}

	public static void main(String[] args) throws IOException {
		new e10871();
	}

}
