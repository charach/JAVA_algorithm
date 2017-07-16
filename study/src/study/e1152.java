package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class e1152 {

	public e1152() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int total = 0;
		while(st.hasMoreTokens()){
			total++;
			st.nextToken();
		}
		System.out.println(total);
	}

	public static void main(String[] args) throws IOException {
		new e1152();
	}

}
