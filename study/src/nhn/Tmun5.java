package nhn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

public class Tmun5 {
	 public static BufferedReader reader;

	    /** 입력으로 주어진 모든 줄들을 입력받아 어레이리스트로 반환해주는 함수 **/
	    public static ArrayList<String> readAllLines() throws Exception
	    {
	        reader = new BufferedReader(new InputStreamReader(System.in));
	        ArrayList<String> lines = new ArrayList<>();
	        while(true){
	            String line = reader.readLine();
	            if(line == null)
	            {   //end of input stream
	                break;
	            }
	            lines.add(line);
	        }
	        reader.close();
	        return lines;
	    }
	    
	public static void main(String[] args) throws Exception {
		ArrayList<String> lines = readAllLines();
		Map<String,StrNode> map = new HashMap<>(); 
		StringBuilder buf;
		String str,strBuf;
		StrNode strNodeBuf;
		Iterator<String> iterator;
		PriorityQueue<StrNode> pq = new PriorityQueue<>();
	
		for(int i=0;i<lines.size();i++){
			str = lines.get(i);
			buf = new StringBuilder();
			
			for(int j=0;j<str.length();j++){
				if(str.charAt(j) >= 'a' && str.charAt(j) <= 'z'){
					buf.append(str.charAt(j));
				}else if(str.charAt(j) >= 'A' && str.charAt(j) <= 'Z'){
					buf.append(str.charAt(j));
				}else{
					if(buf.length() != 0){
						strBuf = buf.toString().toLowerCase();
						if(map.get(strBuf) == null){
							map.put(strBuf, new StrNode(strBuf, 1));
							map.get(strBuf).setLocation(i);
						}else{
							map.get(strBuf).weight++;
							map.get(strBuf).setLocation(i);
						}
						buf = new StringBuilder();
					}
				}
			}
			//남은 문자열 처리
			if(buf.length() != 0){
				strBuf = buf.toString().toLowerCase();
				if(map.get(strBuf) == null){
					map.put(strBuf,new StrNode(strBuf, 1));
					map.get(strBuf).setLocation(i);
				}else{
					map.get(strBuf).weight++;
					map.get(strBuf).setLocation(i);
				}
			}
		}
		iterator = map.keySet().iterator();
		while(iterator.hasNext()){
			strBuf = iterator.next();
			pq.add(map.get(strBuf));
		}
		
		for(int i=0;i<100 && !pq.isEmpty(); i++){
			strNodeBuf = pq.poll();
			System.out.println(strNodeBuf.str+" "+strNodeBuf.getString());
		}
	}
}
class StrNode implements Comparable<StrNode>{
	String str;
	int weight;
	ArrayList<Integer> location;
	public StrNode(String str,int weight){
		this.str = str;
		this.weight = weight;
		location = new ArrayList<>();
	}
	
	public void setLocation(int loc){
		if(location.size() > 10){
			location = new ArrayList<>();
			location.add(-1);
			location.add(loc+1);
		}else if(location.size() > 0 && location.get(0) == -1){
			location.add(1, loc+1);
		}else{
			location.add(loc+1);
		}
	}
	
	public String getString(){
		if(location.get(0) == -1){
			return location.get(1)+"";
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<location.size();i++){
			sb.append(location.get(i)+" ");
		}
		return sb.toString();
	}
	
	@Override
	public int compareTo(StrNode o) {
		if(this.weight > o.weight){
			return -1;
		}else if(this.weight < o.weight){
			return 1;
		}else{
			return this.str.compareTo(o.str);
		}
	}
}