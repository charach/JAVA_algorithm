package kakaoNew;

public class mun6 {
	
	public int solution(int m, int n, String[] board) {
		int answer = 0;
		
		char ary[][] = new char[m][n];
		boolean flag = true;
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board[0].length();j++){
				ary[i][j] = board[i].charAt(j);
			}
		}
		
		while(true){
			
			for(int i=0;i<ary.length;i++){
				for(int j=0;j<ary[0].length;j++){
					flag = check(ary,i,j);
				}
				
			}
			for(int k=0;k<ary.length;k++){
				for(int h=0;h<ary[0].length;h++){
					if(ary[k][h] == 'Z'){
						answer++;
						if(k != 0 && ary[k-1][h] != 'Z'){
							ary[k][h] = ary[k-1][h];
							ary[k-1][h] = 'P';
						}else{
							ary[k][h] = 'P';
						}
						
					}
				}
			}
			System.out.println(answer);
			if(!flag){
				return answer;
			}
		}
	}
	
	/**ary check
	 * @param ary
	 */
	public boolean check(char ary[][],int posI,int posJ){
		char buf = ary[posI][posJ];
		boolean flag = false;
		// 왼쪽 위
		if(posI >= 1 && posJ >= 1){
			if(ary[posI-1][posJ-1] == buf && ary[posI-1][posJ] == buf && ary[posI][posJ-1] == buf){
				ary[posI][posJ] = 'Z';
				ary[posI-1][posJ-1] = 'Z';
				ary[posI-1][posJ] = 'Z';
				ary[posI][posJ-1] = 'Z';
				flag = true;
			}
		}
		// 오른쪽 위
		if(posI >= 1 && posJ < ary[0].length -1){
			if(ary[posI-1][posJ] == buf && ary[posI-1][posJ+1] == buf && ary[posI][posJ+1] == buf){
				ary[posI][posJ] = 'Z';
				ary[posI-1][posJ] = 'Z';
				ary[posI-1][posJ+1] = 'Z';
				ary[posI][posJ+1] = 'Z';
				flag = true;
			}
		}
		
		// 왼쪽 아래
		if(posI < ary.length -1 && posJ < ary.length-1 && posJ >= 1){
			if(ary[posI][posJ-1] == buf && ary[posI+1][posJ-1] == buf && ary[posI+1][posJ] == buf){
				ary[posI][posJ] = 'Z';
				ary[posI][posJ-1] = 'Z';
				ary[posI+1][posJ-1] = 'Z';
				ary[posI+1][posJ] = 'Z';
				flag = true;
			}
		}
		
		// 오른쪽 아래
		if(posI < ary.length -1 && posJ < ary[0].length -1){
			if(ary[posI+1][posJ] == buf && ary[posI+1][posJ+1] == buf && ary[posI][posJ+1] == buf){
				ary[posI+1][posJ] = 'Z';
				ary[posI+1][posJ+1] = 'Z';
				ary[posI][posJ+1] = 'Z';
				ary[posI][posJ] = 'Z';
				flag = true;
			}
		}
		
		return flag;
	}
	public mun6() {
		String[] ary = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
		System.out.println(solution(4,5,ary));
	}
	public static void main(String[] args){
		new mun6();
	}
}
