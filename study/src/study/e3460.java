package study;

import java.util.Scanner;

public class e3460 {

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int count =sc.nextInt();
			int num,j;
			for(int i=0;i<count;i++){
				j=0;
				num = sc.nextInt();
				while(num>0){
					if(num%2 == 1)
						System.out.print(j+ " ");
					j++;
					num /= 2;
				}
			}
		}
}
