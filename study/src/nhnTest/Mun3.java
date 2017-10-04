package nhnTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mun3 {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		char[][] ary = new char[size][size];
		int[][] result = new int[size][size];
		boolean[][] checkAry = new boolean[size][size];
		StringTokenizer st;
		for(int i=0;i<ary.length;i++){
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<ary[0].length;j++){
				ary[i][j] = (st.nextToken()).charAt(0);
			}
		}
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(ary[i][j] != '0' && !checkAry[i][j]){
					check(result,ary,checkAry,i,j);
				}else if(ary[i][j] == '0'){
					result[i][j] = -1;
				}
			}
		}
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
		br.close();
	}
	public static void check(int[][] result,char[][] ary,boolean[][] checkAry,int i,int j){
		boolean left,right,top,down;
		left = right = top = down = false;
		checkAry[i][j] = true;
		if(i -1 >= 0 && !checkAry[i-1][j] && ary[i-1][j] == ary[i][j]){
			check(result,ary,checkAry,i-1,j);
			top = true;
		}

		if(i +1 < ary.length && !checkAry[i+1][j] && ary[i+1][j] == ary[i][j]){
			check(result,ary,checkAry,i+1,j);
			down = true;
		}

		if(j -1 >= 0 && !checkAry[i][j-1] && ary[i][j-1] == ary[i][j]){
			check(result,ary,checkAry,i,j-1);
			left = true;
		}
		
		if(j + 1 < ary.length && !checkAry[i][j+1] && ary[i][j+1] == ary[i][j]){
			check(result,ary,checkAry,i,j+1);
			right = true;
		}
		
		if(top == true){
			if(down == true){
				if(left == true){
					if(right == true){
						result[i][j] = 15;
					}else{
						result[i][j] = 11;
					}
				}else{
					if(right == true){
						result[i][j] = 13;
					}else{
						result[i][j] = 9;
					}
				}
			}else{
				if(left == true){
					if(right == true){
						result[i][j] = 7;
					}else{
						result[i][j] = 3;
					}
				}else{
					if(right == true){
						result[i][j] = 5;
					}else{
						result[i][j] = 1;
					}
				}
			}
		}else{
			if(down == true){
				if(left == true){
					if(right == true){
						result[i][j] = 14;
					}else{
						result[i][j] = 10;
					}
				}else{
					if(right == true){
						result[i][j] = 12;
					}else{
						result[i][j] = 8;
					}
				}
			}else{
				if(left == true){
					if(right == true){
						result[i][j] = 6;
					}else{
						result[i][j] = 2;
					}
				}else{
					if(right == true){
						result[i][j] = 4;
					}else{
						result[i][j] = 0;
					}
				}
			}
		}
		result[i][j] = (ary[i][j]-'A')*15 + result[i][j];
	}
}
