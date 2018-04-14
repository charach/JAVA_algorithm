package SWExpertAcadmy;

import java.util.Arrays;

public class l4II {
	public static int selMin(int ary[][]){
		int min = 0;
		int minX = 0, minY = 0;
		min = ary[0][0];
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(min > ary[i][j]){
					min = ary[i][j];
					minX = i;
					minY = j;
				}
			}
		}
		ary[minX][minY] = 26;
		return min;
	}
	public static void main(String[] args){
		int ary[][] = {
				{9, 20, 2, 18, 11},
				{19, 1 ,25, 3 ,21},
				{8,24,10,17,7},
				{15,4,18,5,6},
				{12,13,22,23,14}
		};
		int sortedAry[][] = new int[5][5];
		int curMin = -1;
		int X,Y;
		int newX = 0, newY = 0;
		
		int dx[] = {1,0,-1,0};
		int dy[] = {0,1,0,-1};
		int dirStat = 0;
		
		for(int i=0;i<25;i++){
			curMin = selMin(ary);
			X = newX;
			Y = newY;
			sortedAry[Y][X] = curMin;
			
			newX = X + dx[dirStat];
			newY = Y + dy[dirStat];
			System.out.println("X" + newX);
			System.out.println("Y" + newY);
			if(newY > 4 || newX > 4 || sortedAry[newY][newX] != 0){
				dirStat = (dirStat + 1 ) % 4;
				newX = X + dx[dirStat];
				newY = Y + dy[dirStat];
			}
		}
		for(int i=0;i<sortedAry.length;i++){
			System.out.println(Arrays.toString(sortedAry[i]));
		}
	}
	
}
