package study;

import java.util.Scanner;
import java.util.StringTokenizer;

public class e9322 {
	static Scanner sc= new Scanner(System.in);
	public static void DFS(String[] ary){
		
	}
	
	/* String to ary*/
	public static void makeAry(String[] ary){
		String stbuf;
		stbuf = sc.nextLine();
		StringTokenizer st = new StringTokenizer(stbuf, " ");
		for(int i=0;st.hasMoreTokens();i++){
			ary[i] = st.nextToken();
		}
	}
	public static void main(String[] args){
		
		int count = sc.nextInt();
		int length;
		String cry1[] = new String[1000];
		String cry2[] = new String[1000];
		String cry3[] = new String[1000];
		int num[] = new int[1000];
		while(count-->0){
			length = sc.nextInt();
			sc.nextLine();
			makeAry(cry1);
			makeAry(cry2);
			for(int i=0;i<length;i++){
				for(int j=0;j<length;j++){
					if(cry1[i].equals(cry2[j])){
						num[j] = i;
					}
				}
			}
			makeAry(cry3);
			for(int i=0;i<length;i++){
				for(int j=0;j<length;j++){
					if(num[j] == i){
						System.out.print(cry3[j]+" ");
					}
				}
			}
			System.out.println();
		
		}
	}
}
