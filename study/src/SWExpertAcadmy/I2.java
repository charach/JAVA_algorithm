package SWExpertAcadmy;

import java.util.Scanner;

public class I2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		SortBySuk sort = new SortBySuk();
		int testCase = sc.nextInt();
		
		for(int i=0;i<testCase;i++){
			int run = 0;
			int triplet = 0;
			
			int num = sc.nextInt();
			
			int ary[] = new int[100];
			
			for(int j=0;j<6;j++){
				ary[num % 10]++;
				num /= 10;
			}
			for(int j=0;j<ary.length;j++){
				if(ary[j] >= 3){
					ary[j] -= 3;
					triplet += 1;
					j = j > 0 ?j-1:j;
				}
				
				if(ary[j] >= 1 && ary[j+1] >= 1 && ary[j+2] >= 1){
					ary[j] -= 1;
					ary[j+1] -= 1;
					ary[j+2] -= 1;
					run += 1;
					j--;
				}
			}
			if(run + triplet == 2){
				System.out.println("Baby Gin");
			}else{
				System.out.println("Lose");
			}
		
			
		}
	}
}
