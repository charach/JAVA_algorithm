package kakao;

import java.util.LinkedList;
import java.util.Queue;

public class mun2 {
	 int MOD = 20170805;
	 public int solution(int m, int n, int[][] cityMap) {
	      int answer = 0;
	      
	      SukNode dp[][] = new SukNode[m][n];
	      for(int i=0;i<m;i++){
	    	  for(int j=0;j<n;j++){
	    		  dp[i][j] = new SukNode();
	    	  }
	      }
	      for(int i=0;i<m;i++){
	    	  for(int j=0;j<n;j++){
	    		  if(cityMap[i][j] != 1){
	    			  if(j-1 >= 0 && cityMap[i][j-1] != 1){
	    				  dp[i][j].right = dp[i][j-1].right+1 % MOD;
	    			  }
	    			  if(i-1 >= 0 && cityMap[i-1][j] != 1){
	    				  if(cityMap[i-1][j] != 0){
	    					  dp[i][j].down = dp[i-1][j].down+1 % MOD;  
	    				  }
	    			  }
	    		  }
	    	  }
	      }
	      
	      if(cityMap[m-1][n-2] != 1){
	    	  answer = dp[m-1][n-2].right % MOD;
	      }
	      
	      if(cityMap[m-2][n-1] != 1){
	    	  answer += dp[m-2][n-1].down % MOD;
	      }
	      for(int i=0;i<m;i++){
	    	  for(int j=0;j<n;j++){
	    		  System.out.println(dp[i][j].down);
	    		  System.out.println(dp[i][j].right);
	    		  System.out.println();
	    	  }
	      }
	      return answer;
	  }
	     class SukNode{
				int right;
				int down;
			}
	     
	     
	     public static void main(String[] args){
	    	 int m = 3;
	    	 int n = 6;
	    	 int ary[][] =
	    		 {{0,2,0,0,0,2}
	    		 ,{0,0,2,0,1,0}
	    		 ,{1,0,0,2,2,0}};
	    	 mun2 mm = new mun2();
	    	 System.out.println(mm.solution(m, n, ary));
	    			
	     }
}
