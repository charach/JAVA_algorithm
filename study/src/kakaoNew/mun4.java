package kakaoNew;

import java.time.LocalTime;
import java.util.Arrays;

public class mun4 {
	
	public String solution(int n, int t, int m, String[] timetable) {
	      String answer = "";
	      LocalTime finalTime = LocalTime.parse("09:00").plusMinutes(t*(n-1));
	      LocalTime timeBuf = LocalTime.parse("09:00");
	      int pos = 0;
	      int person = 0;
	      Arrays.sort(timetable);
	      
	      while(pos < timetable.length && timetable[pos].compareTo(finalTime.toString()) <= 0){
	    	  pos++;
	      }
	      // 자리가 남을때
	      if(pos < m){
	    	  answer = finalTime.toString();
	      }
	      // 자리가 부족할때
	      else{
	    	  if(pos % m == 0){
	    		  answer = LocalTime.parse(timetable[pos-1]).minusMinutes(1).toString();
	    	  }else{
		    	  for(int i=0;i<pos;i++){
		             if(person >= m || !(timeBuf.isAfter(LocalTime.parse(timetable[i])) || timeBuf.equals(LocalTime.parse(timetable[i])))){
		            	 person = 0;
		            	 timeBuf = timeBuf.plusMinutes(t);
		             }
		             person++;
		    	  }
		    	  if(person == m){
		    		  answer = LocalTime.parse(timetable[pos-1]).minusMinutes(1).toString();
		    	  }else{
		    		  answer = LocalTime.parse(timetable[pos-1]).toString();
		    	  }
	    	  }
	      }
	      
	      return answer;
	  }
	
	public mun4() {
		String[] time = {"09:00", "09:00", "09:00", "09:00"};
		System.out.println(solution(2,1,2,time));
		
	}
	
	public static void main(String[] args){
		new mun4();
	}

}
