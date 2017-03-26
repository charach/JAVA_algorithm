package study;

import java.util.Scanner;

public class e6378 {
	public static int dig(int num){
		int sum=0;
		while(num/10 != 0){
			sum += num%10;
			num /= 10;
		}
		return sum+= num%10;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int dig;
		while(!num.equals("0")){
			dig = 0;
			for(int i=0;i<num.length();i++){
				dig += Integer.parseInt(num.charAt(i)+"");
			}
			
			while(dig/10 != 0){
				dig = dig(dig);
			}
			System.out.println(dig);
			num = sc.nextLine();
		}

	}

}
