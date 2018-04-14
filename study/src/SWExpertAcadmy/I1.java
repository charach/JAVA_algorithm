package SWExpertAcadmy;

import java.util.Scanner;

public class I1 {
	public static int Answer;
	
	final static int BLOCK = 1;
	final static int EMPTY = 0;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		Answer = 0;
		
		int ary[][] = new int[N][M];
		
		int height;
		for(int i=0;i<M;i++){
			height = sc.nextInt();
			int j = 0;
			while(j<height){
				ary[j][i] = BLOCK;
				j++;
			}
			while(j<N){
				ary[j][i] = EMPTY;
				j++;
			}
		}
		
		for(int i=0;i<N;i++){
			if(ary[i][0] == BLOCK){
				int j = 1;
				while(ary[i][j] == EMPTY){j++;}
				Answer = Answer > j ? Answer : j;
			}
		}
		System.out.println(Answer);
		
	}
}
