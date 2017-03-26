package study;

import java.util.Scanner;

public class e6321 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num;
		String str;
		num = sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=num;i++){
			str = sc.nextLine();
			System.out.println("String #"+i);
			for(int j=0;j<str.length();j++){
				System.out.print((char)(str.charAt(j)+1==91?'A':str.charAt(j)+1));
			}
			System.out.println("");
		}
	}
}
