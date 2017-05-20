package Midas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineDraw {

	public LineDraw() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		int[] ary = new int[number+1];
		if(number == 1 || number == 2){
			System.out.println((number==1?0:1));
			return;
		}
		ary[2] = 1;
		for(int i=3;i<=number;i++){
			if(i%2 == 1){
				ary[i] = (i+1+ary[i-1]*(i*2));
			}else{
				ary[i] = ((i-1*2)+ary[i-1]*(i*2));
			}
		}
		System.out.println(ary[number]);
		
		br.close();
	}
	
	public static void main(String[] args) throws IOException {
		new LineDraw();
	}

}
