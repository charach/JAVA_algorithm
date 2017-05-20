package Midas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author sukhwan
 * 숫자 n, 제한수 m 
 */
public class MidasNumber {
	ArrayList<Integer> primeAry;
	int m,n;
	public MidasNumber() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		primeAry = new ArrayList<Integer>();
		initPrimeAry();
		checkNumber();
		br.close();
	}
	// 초기화
	void initPrimeAry(){
		int[] numberAry = new int[n+1];
		for(int i=2;i<numberAry.length;i++){
			numberAry[i] = i;
		}
	    for (int i = 2; i <= n; i++) {  
	        for(int j=2;j*i<=n;j++){
	        	numberAry[i*j] = 0;
	        }
	        
	    }
	    for(int i=2;i<numberAry.length;i++){
	    	if(numberAry[i] != 0){
	    		primeAry.add(numberAry[i]);
	    	}
	    }
	    Collections.sort(primeAry);
	}


	int getMaxPrimeFactor(int n){
		int i;
		for(i=primeAry.size()-1;i>=0;i--){
			if(n>= primeAry.get(i) && n % primeAry.get(i) == 0){
				break;
			}
		}
		return primeAry.get(i);
	}
	
	//확인
	void checkNumber(){
		int count = 0;
		for(int i=2;i<n;i++){
			if(getMaxPrimeFactor(i) <= m){
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		new MidasNumber();
	}

}
