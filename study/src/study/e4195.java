package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class e4195 {

	/**
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	/**
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public e4195() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int f;
		StringTokenizer st;
		HashMap<String,Integer> friendList;
		ArrayList<ArrayList<String>> graph;
		HashMap<String,Boolean> mapBuf;
		String str1,str2;
		int location,location2;
		Iterator<String> iterator;
		while(n-->0){
			f = Integer.parseInt(br.readLine());
			friendList = new HashMap<>();
			graph = new ArrayList<>();
			while(f-->0){
				st = new StringTokenizer(br.readLine(), " ");
				str1= st.nextToken();
				str2= st.nextToken();
				if(friendList.get(str1) == null && friendList.get(str2) == null){
					graph.add(new ArrayList<String>());
					location = graph.size()-1;
					graph.get(location).add(str1);
					graph.get(location).add(str2);
					friendList.put(str1, location);
					friendList.put(str2, location);
					System.out.println(2);
				}else if(friendList.get(str1) == null && friendList.get(str2) != null){
					location = friendList.get(str2);
					graph.get(location).add(str1);
					friendList.put(str1,location);
					System.out.println(graph.get(location).size());
				}else if(friendList.get(str1) != null && friendList.get(str2) == null){
					location = friendList.get(str1);
					graph.get(location).add(str2);
					friendList.put(str2,location);
					System.out.println(graph.get(location).size());
				}else if(friendList.get(str1).equals(friendList.get(str2))){
					System.out.println(graph.get(friendList.get(str1)).size());
			    
			    }else{
					if(graph.get(friendList.get(str1)).size() > graph.get(friendList.get(str2)).size()){
						iterator = graph.get(friendList.get(str2)).iterator();
						location = friendList.get(str1);
						location2 = friendList.get(str2);
						while(iterator.hasNext()){
							friendList.put(iterator.next(), location);
						}
						graph.get(location).addAll(graph.get(location2));
						graph.set(location2, null);
						System.out.println(graph.get(location).size());
					}else{
						iterator = graph.get(friendList.get(str1)).iterator();
						location = friendList.get(str2);
						location2 = friendList.get(str1);
						while(iterator.hasNext()){
							friendList.put(iterator.next(), location);
						}
						graph.get(location).addAll(graph.get(location2));
						graph.set(location2, null);
						System.out.println(graph.get(location).size());
					}
				}
			}
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		new e4195();
	}

}
