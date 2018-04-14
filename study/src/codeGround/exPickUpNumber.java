package codeGround;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class exPickUpNumber {
	
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
			
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			
			int buf;
			for(int i=0;i<size;i++){
				buf = sc.nextInt();
				if(map.containsKey(buf) == false){
					map.put(buf, 1);
				}else{
					map.put(buf, map.get(buf)+1);
				}
			}
			
			Set<Integer> key = map.keySet();
			Iterator<Integer> iterator = key.iterator();

			while(iterator.hasNext()){
				buf = iterator.next();
				if(map.get(buf) %2 == 1){
					if(Answer == 0){
						Answer = buf;
					}else{
						Answer = Answer ^ buf;
					}
				}
			}
			
			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}
