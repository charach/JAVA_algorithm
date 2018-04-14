package codeGround;

import java.util.Arrays;
import java.util.Scanner;

public class exProgrammingContest {
	
	static int Answer;

	public static void main(String args[]) throws Exception	{
		/*
		   The method below means that the program will read from input.txt, instead of standard(keyboard) input.
		   To test your program, you may save input data in input.txt file,
		   and call below method to read from the file when using nextInt() method.
		   You may remove the comment symbols(//) in the below statement and use it.
		   But before submission, you must remove the freopen function or rewrite comment symbols(//).
		 */		

		/*
		   Make new scanner from standard input System.in, and read data.
		 */
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {

			Answer = 0;
			
			int size = sc.nextInt();
			
			int ary[] = new int[size];
			
			int max = 0;
			
			for(int i=0;i<size;i++){
				ary[i] = sc.nextInt();
			}
			
			Arrays.sort(ary);
			
			for(int i=0;i<size;i++){
				ary[i] += (size-i);
				if(ary[i] > max){
					max = ary[i];
				}
			}
			for(int i=0;i<size;i++){
				if(ary[i] >= max-i){
					Answer++;
				}
			}
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}
