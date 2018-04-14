package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e4811 {
	
	long count;
	int wCount;
	int hCount;
	StringBuilder sb;
	public e4811() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = -1;
		
		while(true){
			cnt = Integer.parseInt(br.readLine());
			
			if(cnt == 0){
				return;
			}
			count = 0;
			wCount = cnt;
			hCount = 0;
			sb = new StringBuilder();
			recu(cnt,0);
			System.out.println(count);
		}
	
	}
	
	public void recu(int size,int day){
		if(day == 2*size){
			count++;
		}else{
			if(wCount > 1){
				wCount--;
				hCount++;
				recu(size,day+1);
				wCount++;
				hCount--;
			}
			if(hCount > 0){
				hCount--;
				recu(size,day+1);
				hCount++;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		new e4811();
	}

}
