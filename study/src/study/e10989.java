package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class e10989 {

	public e10989() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = Integer.parseInt(br.readLine());
		int ary[] = new int[10001];
		int max=0,num;
		for(int i=0;i<cnt;i++){
			num = Integer.parseInt(br.readLine()); 
			ary[num]++;
			max = max<num?num:max;
		}
		
		for(int i=1;i<=max;i++){
			if(ary[i] == 1){
				out.write(i+"\n");
			}else if(ary[i] > 1){
				for(int j=0;j<ary[i];j++){
					out.write(i+"\n");	
				}
			}
		}
		out.flush();
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		new e10989();
	}

}
