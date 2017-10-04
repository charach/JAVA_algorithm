package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class e1389 {
	int ary[][];
	
	final int MAXNUM = 210000000;
	public e1389() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int a,b;
		int minSum,minPos = 0,sum;
		ary = new int[n][n];
		
		while(m-->0){
			st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken())-1;
			b = Integer.parseInt(st.nextToken())-1;
			ary[a][b] = 1;
			ary[b][a] = 1;
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(ary[i][j] == 0){
					ary[i][j] = MAXNUM;
				}
			}
		}
		
		for(int i=0;i<n;i++){
			dik(i);
		}
		minSum = MAXNUM+1;
		for(int i=0;i<n;i++){
			sum = 0;
			for(int j=0;j<n;j++){
				sum += ary[i][j];
			}
			sum -= ary[i][i];
			if(minSum > sum){
				minSum = sum;
				minPos = i;
			}
		}
		System.out.println(minPos+1);
		
		br.close();
	}
	
	public void dik(int pos){
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(pos);
		
		boolean visit[] = new boolean[ary.length];
		
		int minBuf,minPos = 0;
		
		for(int k=0;k<ary.length;k++){
			
			minBuf = MAXNUM+1;
			
			for(int i=0;i<ary[pos].length;i++){
				if(!visit[i] && minBuf > ary[pos][i]){
					minBuf = ary[pos][i];
					minPos = i;
				}
			}
			visit[minPos] = true;
			
			for(int i=0;i<ary[pos].length;i++){
				if(ary[pos][i] > ary[pos][minPos] + ary[minPos][i]){
					ary[pos][i] = ary[pos][minPos] + ary[minPos][i];
				}
			}
			
		}
	}

	public static void main(String[] args) throws IOException {
		new e1389();
	}

}
