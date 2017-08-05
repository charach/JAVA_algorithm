package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class e2751 {
	int[] aryBuf;
	public e2751() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int ary[] = new int[size];
		
		for(int i=0;i<ary.length;i++){
			ary[i] = Integer.parseInt(br.readLine());
		}
		this.aryBuf = new int[size];
		divide(0,ary.length-1,ary);
		ary = this.aryBuf;
		
		for(int i=0;i<ary.length;i++){
			System.out.println(ary[i]);
		}
		
	}
	
	public void divide(int start,int end,int ary[]){
		if(start < end){
			divide(start,(start+end)/2,ary);
			divide((start+end)/2+1,end,ary);
			conquer(start,end,ary);
		}
	}
	
	public void conquer(int start,int end,int ary[]){
		int mid = (start+end)/2;
		int lpos = start,rpos = mid+1;
		int index = start;
		while(lpos <= mid && rpos <= end){
			if(ary[lpos] < ary[rpos]){
				this.aryBuf[index++] = ary[lpos++];
			}else{
				this.aryBuf[index++] = ary[rpos++];
			}
		}
		
		while(lpos <= mid){
			this.aryBuf[index++] = ary[lpos++];
		}
		
		while(rpos <= end){
			this.aryBuf[index++] = ary[rpos++];
		}
		
		for(int i=start;i<=end;i++){
			ary[i] = aryBuf[i];
		}
	}
	
	public static void main(String[] args) throws IOException{
		new e2751();
	}

}
