package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class e9426 {

	public e9426() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int start = (k+1)/2;
	    int distance = start;
	    distance = k % 2 == 0 ? distance+1 : distance; 
	    long sum = 0;
		while(n-->0){
			queue.add(Integer.parseInt(br.readLine()));
	    }
	    while(start-->1){
	    	queue.poll();
	    }
	    while(queue.size() >= distance){
	    	sum += queue.poll();
	    }
	    System.out.println(sum);
	    
	}
	
	public static void main(String[] args) throws IOException{
		new e9426();
	}

}
