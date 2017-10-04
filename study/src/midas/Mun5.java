package midas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Mun5 {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int size = Integer.parseInt(st.nextToken());
		int cnt = Integer.parseInt(st.nextToken());
		PriorityQueue<SukNode> pq = new PriorityQueue<>();
		
		while(cnt-->0){
			st = new StringTokenizer(br.readLine(), " ");
			pq.add(new SukNode(st.nextToken(),st.nextToken(),st.nextToken()));
		}
		
		kru(pq);
		
		br.close();
	}
	
	public static void kru(PriorityQueue<SukNode> pq){
		int[] ary = new int[pq.size()];
		int total = 0;
		for(int i=0;i<ary.length;i++){
			ary[i] = -1;
		}
		SukNode buf;
		while(!pq.isEmpty()){
			if(find(ary,pq.peek().a) != find(ary,pq.peek().b)){
				union(ary, pq.peek().a, pq.peek().b);
				total += pq.peek().c;
			}
			pq.poll();
		}
		System.out.println(total);
	}
	
	public static int find(int[] ary,int x){
		if(ary[x] < 0){
			return x;
		}else{
			return ary[x] = find(ary,ary[x]);
		}
		
	}
	
	public static void union(int[] ary,int a, int b) {
		 
	    int root1 = find(ary,a);
	    int root2 = find(ary,b);
	 
	    // 이미 같은 그룹이라면
	    if (root1 == root2) {
	 
	        return;
	    }
	 
	    if (ary[root1] > ary[root2]) {
	 
	        root1 ^= root2;
	        root2 ^= root1;
	        root1 ^= root2;
	    }
	 
	    ary[root1] += ary[root2];
	    ary[root2] = root1;
	 
	}

}
class SukNode implements Comparable<SukNode>{
	int a;
	int b;
	int c;
	public SukNode(){
		
	}
	public SukNode(String a,String b,String c){
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		this.c = Integer.parseInt(c);
		
		int buf;
		if(this.a > this.b){
			buf = this.a;
			this.a = this.b;
			this.b = buf;
		}
		
	}
	@Override
	public int compareTo(SukNode o) {
		if(this.c > o.c){
			return 1;
		}else if(this.c < o.c){
			return -1;
		}else{
			return 0;
		}
	}
}
