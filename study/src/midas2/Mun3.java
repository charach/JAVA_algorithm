package midas2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Mun3 {

	public Mun3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		SukPos start = new SukPos(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		
		st = new StringTokenizer(br.readLine(), " ");
		SukPos end = new SukPos(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		
		int size = Integer.parseInt(br.readLine());
		PriorityQueue<SukPos> queue = new PriorityQueue<>();
		
		while(size-->0){
			st = new StringTokenizer(br.readLine(), " ");
			queue.add(new SukPos(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
		}
		
		ArrayList<SukPos> stC = check(start,queue);
		ArrayList<SukPos> enC = check(end,queue);
		
		if(stC.size() == 0){
			System.out.println(enC.size());
		}else if(enC.size() == 0){
			System.out.println(stC.size());
		}
		
		if(stC.size() == enC.size()){
			
		}
		
	}
	
	public static ArrayList<SukPos> check(SukPos point,PriorityQueue<SukPos> queue){
		ArrayList<SukPos> list = new ArrayList<>();
		SukPos buf;
		Iterator<SukPos> iterator = queue.iterator();
		while(iterator.hasNext()){
			buf = iterator.next();
			if(calc(point.x, point.y, buf.x, buf.y) < buf.rad){
				list.add(buf);
			}
		}
		return list;
	}
	
	public static double calc(int x1,int y1,int x2,int y2){
		return Math.sqrt(Math.pow(Math.abs(x2-x1),2) + Math.pow(Math.abs(y2-y1),2));
	}
	
}
class SukPos implements Comparable<SukPos>{
	int x;
	int y;
	int rad;
	
	public SukPos(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public SukPos(int x, int y, int rad) {
		super();
		this.x = x;
		this.y = y;
		this.rad = rad;
	}
	
	@Override
	public int compareTo(SukPos o) {
		if(this.rad > o.rad){
			return -1;
		}else if(this.rad < o.rad){
			return 1;
		}else{
			return 0;
		}
	}
	
	
}
