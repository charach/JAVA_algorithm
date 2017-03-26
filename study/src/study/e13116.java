package study;

import java.util.Scanner;

public class e13116 {
	
	
	public static void main(String[] args){
		int count,numA,numB,temp;
		Scanner sc = new Scanner(System.in);
		count	   = sc.nextInt();
		for(int i=0;i<count;i++){
			numA = sc.nextInt();
			numB = sc.nextInt();
			if(numA>numB){
				temp = numB;
				numB = numA;
				numA = temp;
			}
			while(numA != 1 || numB != 1){
				while(numB > numA){
					
					numB /=2;

				}
				while(numB < numA){
					numA /=2;
				}
				if(numB == numA){
					break;
				}
			}
			if(numB == 1){
				System.out.println(10);
			}
			else{
				System.out.println(numB*10);
			}
		}
	}
}
