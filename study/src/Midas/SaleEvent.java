package Midas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SaleEvent {
	int ary[];
	public SaleEvent() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int minWeight = 2000000000;
		ary = new int[count];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<count;i++){
			ary[i] = Integer.parseInt(st.nextToken());
		}
		int weight;
		for(int i=0;i<ary.length;i++){
			weight = 0;
			for(int j=0;j<i;j++){
				weight += ary[j];
			}
			weight += divide(i,ary.length-i);
			if(minWeight > weight)
				minWeight = weight;
		}
		System.out.println(minWeight);
		
	}
	
	public int divide(int startPoint,int length){
		if(length > 3){
			return divide(startPoint,3)+divide(startPoint+3,length-3);
		}else if(length == 3){
			if(ary[startPoint] < ary[startPoint+1] && ary[startPoint] < ary[startPoint+2])
				return ary[startPoint+1] + ary[startPoint+2]; 
			else if(ary[startPoint+1] < ary[startPoint] && ary[startPoint+1] < ary[startPoint+2])
				return ary[startPoint] + ary[startPoint+2]; 			
			else
				return ary[startPoint+1] + ary[startPoint]; 
		}else if(length == 2){
			return ary[startPoint]+ary[startPoint+1];
		}else if(length ==1){
			return ary[startPoint];
		}else{
			return 0;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		new SaleEvent();
	}

}
