package midas2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Mun2 {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		int sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		while(size-->0){
			queue.add(Integer.parseInt(st.nextToken()));
		}
		
		while(!queue.isEmpty()){
			sum += queue.poll() * (queue.size()+1);
		}
		
		System.out.println(sum);
		
		br.close();
	}

}
