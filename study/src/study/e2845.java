package study;

import java.util.Scanner;

public class e2845 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pCount = sc.nextInt();
		int aCount = sc.nextInt();
		pCount *= aCount;
		for(int i=0;i<5;i++){
			System.out.print(sc.nextInt()-pCount+" ");
		}

	}

}
