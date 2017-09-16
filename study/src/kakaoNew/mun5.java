package kakaoNew;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class mun5 {
	
	public int solution(String str1, String str2) {
	      int answer = 0;
	      Map<String,Integer> str1List = new HashMap<>();
	      Map<String,Integer> str2List = new HashMap<>();
	     
	      makeList(str1.toLowerCase(),str1List);
	      makeList(str2.toLowerCase(),str2List);
	      
	      long interCount = interCount(str1List,str2List);
	      long unionCount = unionCount(str1List,str2List);
	      
	      answer =  (int) (((double)interCount/unionCount)*65536);
	      
	      return answer == 0 ? 65536 : answer;
	  }
	
	public void makeList(String str,Map<String,Integer> map){
		StringBuilder sb = new StringBuilder();
		String buf;
		for(int i=0;i<str.length();i++){
			//문자일때
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
			
				if(sb.length() < 1){
					sb.append(str.charAt(i));
				}else{
					sb.append(str.charAt(i));
					buf = sb.toString();
					if(map.get(buf) != null){
						map.put(buf, map.get(buf)+1);
					}else{
						map.put(buf,1);
					}
					
					sb.deleteCharAt(0);
				}
				
			}
			// 특수 문자 일 경우
			else{
				sb = new StringBuilder();
			}
		}
	}
	
	/**
	 * 교집합
	 * @param str1List
	 * @param str2List
	 * @return
	 */
	public long interCount(Map<String,Integer> str1List,Map<String,Integer> str2List){
		int count = 0;
		Iterator<String> iterator;
		String buf;
		if(str1List.size() <= str2List.size()){
			iterator = str1List.keySet().iterator();
			while(iterator.hasNext()){
				buf = iterator.next();
				if(str2List.containsKey(buf)){
					count += Math.min(str1List.get(buf),str2List.get(buf));
				}
			}
			
		}else{
			iterator = str2List.keySet().iterator();
			while(iterator.hasNext()){
				buf = iterator.next();
				if(str1List.containsKey(buf)){
					count += Math.min(str1List.get(buf),str2List.get(buf));
				}
			}
		}
	 
	    return count;
	}
	
	/**
	 * 합집합
	 * @param str1List
	 * @param str2List
	 * @return
	 */
	public long unionCount(Map<String,Integer> str1List,Map<String,Integer> str2List){
		long count = 0;
		Iterator<String> iterator = str1List.keySet().iterator();
		while(iterator.hasNext()){
			count += str1List.get(iterator.next());
		}
		
		iterator = str2List.keySet().iterator();
		String buf;
		while(iterator.hasNext()){
			buf = iterator.next();
			if(str1List.get(buf) == null){
				count += str2List.get(buf);
			}else{
				count -= str1List.get(buf);
				count += Math.max(str1List.get(buf), str2List.get(buf));
			}
		}
		return count;
	}
	
	public mun5() {
		System.out.println(solution("aa1+aa2","AAAA12"));
	}
	
	public static void main(String[] args){
		new mun5();
	}

}
