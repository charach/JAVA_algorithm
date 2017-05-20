package Startup;

public class mun2 {

	public mun2() {
		// TODO Auto-generated constructor stub
	}
	 public int solution(int n, int[] stations, int w) {
	    	int answer = 0;
	    	int i;
	    	if(stations[0]-w-1 > 0){
	    		answer += (stations[0]-w-1) / (w*2+1);
	        	answer += ((stations[0]-w-1) % (w*2+1) == 0?0:1);
	    	}
	    	for(i=1;i<stations.length;i++){
	    		if(stations[i]-stations[i-1]-w*2-1>0){
	    			answer += (stations[i]-stations[i-1]-w*2-1) / (w*2+1);
	            	answer += ((stations[i]-stations[i-1]-w*2-1) % (w*2+1) == 0?0:1);	
	    		}
	    	}
	    	if(n-stations[i-1]-w > 0){
	    		answer += (n-stations[i-1]-w) / (w*2+1);    		
	    		answer += ((n-stations[i-1]-w) % (w*2+1) == 0?0:1);
	    	}
	    	
	    	return answer;
		}
}
