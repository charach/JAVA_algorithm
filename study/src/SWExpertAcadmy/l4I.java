package SWExpertAcadmy;

public class l4I {
	public static boolean isWall(int x, int y){
		if(x < 0 || x >= 5) return true;
		if(y < 0 || y >= 5) return true;
		return false;
	}
	
	public static void main(String[] args){
		int ary[][] = {
				{9, 20, 2, 18, 11},
				{19, 1, 25, 3, 21},
				{8, 24, 10, 17, 7},
				{15, 4, 16, 5 , 6},
				{12, 13, 22, 23, 14}
		};
		
		int dx[] = {0,0,-1,1};
		int dy[] = {-1,1,0,0};
		
		int newX,newY;
		int sum = 0;
		
		for(int i=0;i<ary.length;i++){
			for(int j=0;j<ary[i].length;j++){
				for(int dir = 0; dir<4; dir++){
					if(!isWall(i+dir, j+dir)) sum += Math.abs(ary[i][j] + ary[i+dir][j+dir]);
				}
			}
		}
		System.out.println(sum);
		
	}
}
