package Startup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class mun1 {
	public mun1() throws IOException{
		
	}
	int[] sumAry = new int[20000];
	int sumLength;
	
	public boolean checkPrime(int num){
		for(int i=2;i<num;i++){
			if(num%i == 0)
				return false;
		}
		return true;
	}
	public void initSumAry(int[] nums){
		sumLength = 0;
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				for(int k=j+1;k<nums.length;k++){
					sumAry[sumLength] = nums[i] + nums[j]+ nums[k];
					sumLength++;
				}
			}
		}
	}
	public int solution(int[] nums) {
	    int answer = 0;
	    initSumAry(nums);
	    for(int i=0;i<sumLength;i++){
	    	if(checkPrime(sumAry[i])){
	    			answer++;
	    		}
	    }
	    return answer;
	}
	
	public static void main(String[] args) throws IOException {
		new mun1();
	}
}
