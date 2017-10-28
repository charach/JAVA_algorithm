package midas2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Mun1 {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		int sum = 0;
		int pos = 1;
		while(size-->0){
			queue.add(Integer.parseInt(br.readLine()));
		}
		
		while(!queue.isEmpty()){
			sum += Math.abs(queue.poll()-pos);
			pos++;
		}
		
		System.out.println(sum);
		
		br.close();
	}

}
