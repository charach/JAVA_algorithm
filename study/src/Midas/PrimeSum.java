package Midas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class PrimeSum {
	int m,n;
	public PrimeSum() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		m = Integer.parseInt(br.readLine());
		n = Integer.parseInt(br.readLine());
		initPrimeAry();
		br.close();
	}
	// √ ±‚»≠
	void initPrimeAry(){
		long sum = 0;
		int[] numberAry = new int[n+1];
		for(int i=2;i<numberAry.length;i++){
			numberAry[i] = i;
		}
	    for (int i = 2; i <= n; i++) {  
	        for(int j=2;j*i<=n;j++){
	        	numberAry[i*j] = 0;
	        }
	        
	    }
	    
	    for(int i=m;i<numberAry.length;i++){
	    	if(numberAry[i] != 0){
	    		sum += numberAry[i];
	    	}
	    }
	    System.out.println(sum);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		new PrimeSum();
	}

}
