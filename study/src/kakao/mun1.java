package kakao;

import java.util.LinkedList;
import java.util.Queue;

public class mun1 {
	public int dik(int i,int j,int picture[][]){
		int sizeOfArea = 0;
		int num = picture[i][j];
		picture[i][j] = 0;
		Queue<SukNode> queue = new LinkedList<SukNode>();
		queue.add(new SukNode(i,j));
		SukNode nodeBuf;
		while(!queue.isEmpty()){
			nodeBuf = queue.poll();
			i = nodeBuf.m;
			j = nodeBuf.n;
			if(i-1 >= 0 && picture[i-1][j] == num){
				queue.add(new SukNode(i-1, j));
				picture[i-1][j] = 0;
			}
			if(j-1 >= 0 && picture[i][j-1] == num){
				queue.add(new SukNode(i,j-1));
				picture[i][j-1] = 0;
			}
			if(i+1 < picture.length && picture[i+1][j] == num){
				queue.add(new SukNode(i+1,j));
				picture[i+1][j] = 0;
			}
			if(j+1 < picture[0].length && picture[i][j+1] == num){
				queue.add(new SukNode(i,j+1));
				picture[i][j+1] = 0;
			}
			sizeOfArea++;
		}
		
		
		return sizeOfArea;
	}
	public mun1(int m,int n,int picture[][]) {
	  int numberOfArea = 0;
      int maxSizeOfOneArea = 0;
      int numBuf;
      for(int i=0;i<m;i++){
    	  for(int j=0;j<n;j++){
    		  if(picture[i][j] != 0){
    			  numBuf = dik(i,j,picture);
    			  maxSizeOfOneArea = maxSizeOfOneArea < numBuf ? numBuf: maxSizeOfOneArea; 
    			  numberOfArea++;
    		  }
    	  }
      }
      
      int[] answer = new int[2];
      answer[0] = numberOfArea;
      answer[1] = maxSizeOfOneArea;
      System.out.println(answer[0]);
      System.out.println(answer[1]);
	}
	
	class SukNode{
		int m;
		int n;
		public SukNode(int m,int n){
			this.m = m;
			this.n = n;
		}
	}
	
	public static void main(String[] args){
		int m = 7;
		int n = 5;
		int picture[][] = {
		               {2,2,2,2,2},
		               {2,2,2,2,2},
		               {2,1,1,2,2},
		               {2,1,1,2,2},
		               {2,4,5,3,2},
		               {2,2,6,3,2},
		               {2,2,9,3,2}};
		mun1 xx = new mun1(m,n,picture);
	}
}
