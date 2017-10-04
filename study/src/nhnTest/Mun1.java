package nhnTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Mun1 {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> ary = new ArrayList<>(3);
		ArrayList<Integer> destroy = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int buf;
		while(st.hasMoreTokens()){
			buf = Integer.parseInt(st.nextToken());
			if(ary.contains(buf)){
				ary.remove(new Integer(buf));
				ary.add(buf);
			}
			else if(ary.size() == 3){
				destroy.add(ary.get(0));
				ary.remove(0);
				ary.add(buf);
			}
			else{
				ary.add(buf);
			}
		}
		
		if(destroy.isEmpty()){
			System.out.println(0);
		}
		else{
			Iterator<Integer> iterator = destroy.iterator();
			while(iterator.hasNext()){
				System.out.println(iterator.next());
			}
		}
		
		br.close();
	}
	
}
