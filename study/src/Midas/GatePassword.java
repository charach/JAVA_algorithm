package Midas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * n = 비밀번호 길이, m = 숫자의 갯수
 * 1개의 짝수(0포함) && 1개의 홀수 
 * 오름차순 정렬
 * 비밀번호 갯수 구하기
 * @author sukhwan
 *
 */
public class GatePassword {
	
	long combination[][];
	public GatePassword() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n,m,countEven,countOdd;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		combination = new long[m+1][n+1];
		st = new StringTokenizer(br.readLine(), " ");
		int numBuf;
		countEven = countOdd = 0;
		for(int i=0;i<m;i++){
			numBuf = Integer.parseInt(st.nextToken());
			if(numBuf %2 == 0)
				countEven++;
			else
				countOdd++;
		}
		initcombinate(m,n);
		if(countEven == 0 || countOdd == 0 || n == 1)
			System.out.println(0);
		else if(n==2)
			System.out.println(countOdd * countEven);
		else if(countEven == 1)
			System.out.println(combination[countOdd][n-1]);
		else if(countOdd == 1)
			System.out.println(combination[countEven][n-1]);
		else{
			long count = 0;
			for(int i=1;i<=countEven;i++){
				count += (combination[countEven][i] * combination[countOdd][n-i]); 
			}
			System.out.println(count);
		}
		br.close();
	}

	public void initcombinate(int n, int r) { 
		for(int i=1;i<n+1;i++){
			for(int j=0;j<r+1;j++){
				if(i == j || j == 0) 
					combination[i][j] = 1;
				else if(j==1)
					combination[i][j] = i;
				else
					combination[i][j] = combination[i-1][j-1] + combination[i-1][j];
			}
		}
	}

	
	public static void main(String[] args) throws NumberFormatException, IOException{
		new GatePassword();
	}
}
