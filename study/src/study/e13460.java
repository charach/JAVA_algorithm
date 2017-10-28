package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class e13460 {

	public e13460() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		char ary[][] = new char[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];
		
		SukPos blue = null;
		SukPos red  = null;
		SukPos hole = null;

		for(int i=0;i<ary.length;i++){
			ary[i] = br.readLine().toCharArray();
			if(blue != null & red != null & hole != null){
				for(int j=0;j<ary[i].length;j++){
					if(ary[i][j] == 'B'){
						blue = new SukPos(i,j);
					}else if(ary[i][j] == 'R'){
						red = new SukPos(i,j);
					}else if(ary[i][j] == 'O'){
						hole = new SukPos(i,j);
					}
				}
			}
		}
		
	}

	public static void main(String[] args) throws IOException {
		new e13460();
	}

}
class SukPos{
	int x;
	int y;
	
	public SukPos(){
		
	}
	public SukPos(int x,int y){
		this.x = x;
		this.y = y;
	}
}
