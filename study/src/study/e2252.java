package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class e2252 {
	ArrayList<Integer>[] arrayList;
	int[] personAry;
	public e2252() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int size = Integer.parseInt(st.nextToken());
		int count  = Integer.parseInt(st.nextToken());
		arrayList = new ArrayList[size+1];
		personAry = new int[size+1];
		int a,b;
		for(int i=0;i<count;i++){
			st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			personAry[b]++;
			if(arrayList[a] == null){
				arrayList[a] = new ArrayList<>();
			}
			arrayList[a].add(b);
		}
		topologicalSort();
		br.close();
	}
	public void topologicalSort(){
		Queue<Integer> sQ  =  new PriorityQueue<Integer>();
		Queue<Integer> rQ = new LinkedList();
		for(int i=1;i<personAry.length;i++){
			if(personAry[i] == 0){
				sQ.offer(i);
			}
		}
		int node,index;
		while(!sQ.isEmpty()){
			node = sQ.poll();
			rQ.offer(node);
			if(arrayList[node] != null){
				for(int i=0;i<arrayList[node].size();i++){
					index = arrayList[node].get(i);
					personAry[index]--;
					if(personAry[index] == 0)
						sQ.add(index);
				}
			}
		}
		while(!rQ.isEmpty()){
			System.out.print(rQ.poll()+" ");
		}
	}
	public static void main(String[] args) throws IOException {
		new e2252();
	}

}
