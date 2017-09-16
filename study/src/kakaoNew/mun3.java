package kakaoNew;

import java.util.LinkedList;
import java.util.List;

public class mun3 {
	
	public int solution(int cacheSize, String[] cities) {
	      int answer = 0;
	      // cache Size 가 0일경우
	      if(cacheSize == 0){
	    	return cities.length * 5;  
	      }
	      List<String> cache = new LinkedList<>();
	      
	      
	      for(int i=0;i<cities.length;i++){
	          if(cache.contains(cities[i].toLowerCase())){
	        	  answer++;
	          }else{
	        	  if(cache.size() == cacheSize){
		        	  cache.remove(0);
		        	  System.out.println("hihi");
	        	  }
	        	  cache.add(cities[i].toLowerCase());
	        	  
	        	  answer += 5;
	          }
	      }
	      return answer;
	  }
	
	public mun3() {
		String[] ary = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}; 
		System.out.println(solution(5,ary));
	}
	
	public static void main(String[] args){
		new mun3();
	}

}
