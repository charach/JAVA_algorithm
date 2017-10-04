package nhn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Mun1 {

	public Mun1() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		int a =0,b = 0,numBuf;
		int dif = 210000000;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		while(st.hasMoreTokens()){
			pq.add(Integer.parseInt(st.nextToken()));
		}
		while(pq.size() > 1){
			numBuf = pq.poll();
			if(Math.abs(numBuf - pq.peek()) < dif){
				a = numBuf;
				b = pq.peek();
				dif = Math.abs(a - pq.peek());
			}
		}
		System.out.println(a+" "+b);
		
	}
}
